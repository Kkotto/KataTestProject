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
        return null;
    }

    public static boolean isInputValid(int inputValuesAmount) {
        return inputValuesAmount == Constant.VALUES_AMOUNT;
    }
}