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
        try {
            calc(input);
        } catch (IncorrectDataException exception) {
            LOGGER.log(Level.WARNING, exception.getMessage());
        }
    }

    public static String calc(String input) throws IncorrectDataException {
        List<String> inputValues = Arrays.asList(input.split(Constant.INPUT_SPLIT_REGEX));
        if (!isInputValid(inputValues.size())) {
            throw new IncorrectDataException(Constant.INCORRECT_INPUT_FORMAT);
        }
        String firstValue = inputValues.get(Constant.FIRST_NUMBER_INPUT_POSITION);
        String secondValue = inputValues.get(Constant.SECOND_NUMBER_INPUT_POSITION);
        if (isDifferentType(firstValue, secondValue)) {
            throw new IncorrectDataException(Constant.DIFFERENT_TYPES_EXCEPTION_TEXT);
        }
        boolean isRomanType = isRoman(firstValue);
        int firstNumber, secondNumber;
        try {
            firstNumber = parseNumber(isRomanType, firstValue);
            secondNumber = parseNumber(isRomanType, secondValue);
        } catch (NumberFormatException exception) {
            throw new IncorrectDataException(Constant.NOT_NUMBER_EXCEPTION_TEXT);
        }
        if (!isRangeValid(firstNumber) || !isRangeValid(secondNumber)) {
            throw new IncorrectDataException(Constant.WRONG_RANGE_EXCEPTION_TEXT);
        }
        return null;
    }

    public static boolean isInputValid(int inputValuesAmount) {
        return inputValuesAmount == Constant.VALUES_AMOUNT;
    }

    public static boolean isDifferentType(String firstValue, String secondValue) {
        return isRoman(firstValue) ^ isRoman(secondValue);
    }

    public static boolean isRoman(String value) {
        return Arrays.stream(RomanNumber.values()).anyMatch(romanNumber -> romanNumber.getRomanValue().equals(value));
    }

    public static int parseNumber(boolean isRomanType, String value) throws NumberFormatException {
        if (isRomanType) {
            return RomanNumber.convertToArabic(value);
        } else {
            return Integer.parseInt(value);
        }
    }

    public static boolean isRangeValid(int number) {
        return number >= Constant.MIN_VALUE && number <= Constant.MAX_VALUE;
    }
}