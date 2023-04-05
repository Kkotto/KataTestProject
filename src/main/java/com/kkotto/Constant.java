package com.kkotto;

class Constant {
    public static final int FIRST_NUMBER_INPUT_POSITION = 0;
    public static final int ACTION_INPUT_POSITION = 1;
    public static final int SECOND_NUMBER_INPUT_POSITION = 2;
    public static final String INPUT_SPLIT_REGEX = " ";
    public static final int VALUES_AMOUNT = 3;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 10;
    public static final int MIN_ROMAN_VALUE = 1;
    public static final String NOT_NUMBER_EXCEPTION_TEXT = "Некорректные данные: нечисловое значение.";
    public static final String DIFFERENT_TYPES_EXCEPTION_TEXT =
            "Некорректные данные: используются разные системы счисления.";
    public static final String INCORRECT_INPUT_FORMAT_EXCEPTION_TEXT =
            "Формат математической операции не удовлетворяет заданию.";
    public static final String WRONG_RANGE_EXCEPTION_TEXT =
            "Некорректные данные: число не входит в диапазон от 1 до 10.";
    public static final String INVALID_ACTION_EXCEPTION_TEXT =
            "Некорректные данные: возможен ввод только сложения (+), вычитания (-), умножения (*), деления (/).";
    public static final String NON_POSITIVE_VALUE_EXCEPTION_TEXT =
            "В результате работы калькулятора с римскими числами получилось неположительное число.";
}
