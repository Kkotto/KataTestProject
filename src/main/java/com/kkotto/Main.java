package com.kkotto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        calc(input);
    }

    public static String calc(String input) {
        List<String> inputValues = Arrays.asList(input.split(Constant.INPUT_SPLIT_REGEX));
        List<Integer> numbers = recognizeOneTypeNumbers(List.of(inputValues.get(Constant.FIRST_NUMBER_INPUT_POSITION),
                inputValues.get(Constant.SECOND_NUMBER_INPUT_POSITION)));
        String action = inputValues.get(1);
        System.out.println(numbers.get(0) + " " + action + " " + numbers.get(1));
        return null;
    }

    public static boolean isRoman(String value) {
        return Arrays.stream(RomanNumber.values()).anyMatch(romanNumber -> romanNumber.getRomanValue().equals(value));
    }

    public static List<Integer> recognizeOneTypeNumbers(List<String> values) {
        String firstValue = values.get(0);
        String secondValue = values.get(1);
        int firstNumber = Constant.DEFAULT_VALUE, secondNumber = Constant.DEFAULT_VALUE;
        try {
            if (isRoman(firstValue) && isRoman(secondValue)) {
                firstNumber = RomanNumber.convertToArabic(firstValue);
                secondNumber = RomanNumber.convertToArabic(secondValue);
            }
            if (isRoman(firstValue) || isRoman(secondValue)) {
                throw new IllegalArgumentException();
            } else {
                firstNumber = Integer.parseInt(firstValue);
                secondNumber = Integer.parseInt(secondValue);
            }
        } catch (NumberFormatException exception) {
            LOGGER.log(Level.WARNING, Constant.NOT_NUMBER_EXCEPTION_TEXT);
        } catch (IllegalArgumentException exception) {
            LOGGER.log(Level.WARNING, Constant.DIFFERENT_TYPES_EXCEPTION_TEXT);
        }
        return List.of(firstNumber, secondNumber);
    }
}