package com.kkotto;

import java.util.LinkedHashMap;
import java.util.Map;

class RomanNumberConverter {
    private static RomanNumberConverter instance;
    private final Map<String, Integer> romanNumbers;

    private RomanNumberConverter() {
        // LinkedHashMap, т.к. важен порядок
        romanNumbers = new LinkedHashMap<>();
        romanNumbers.put("C", 100);
        romanNumbers.put("XC", 90);
        romanNumbers.put("L", 50);
        romanNumbers.put("XL", 40);
        romanNumbers.put("X", 10);
        romanNumbers.put("IX", 9);
        romanNumbers.put("V", 5);
        romanNumbers.put("IV", 4);
        romanNumbers.put("I", 1);
    }

    public static RomanNumberConverter getInstance() {
        if (instance == null) {
            instance = new RomanNumberConverter();
        }
        return instance;
    }

    public String convertToRoman(int value) {
        StringBuilder result = new StringBuilder();
        // Перебор значений мапа
        for (Map.Entry<String, Integer> entry : romanNumbers.entrySet()) {
            int currentNumber = entry.getValue();
            // Если число больше текущего из мапа, то оно:
            // 1. вносится в result;
            // 2. уменьшается на текущее значение мапа.
            // Например:
            // 57 -> 57-50=7 -> 7-5=2 -> 2-1=1 -> 50+5+1+1
            while (value >= currentNumber) {
                result.append(entry.getKey());
                value -= currentNumber;
            }
        }
        return result.toString();
    }

    public int convertToArabic(String value) {
        int result = 0;
        int prevValue = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            int currentNumber = romanNumbers.get(String.valueOf(value.charAt(i)));
            if (currentNumber < prevValue) {
                // Уменьшение, например, в числе XIV, где I<X
                result -= currentNumber;
            } else {
                result += currentNumber;
            }
            prevValue = currentNumber;
        }
        return result;
    }

    public boolean isRoman(String value) {
        for (int i = value.length() - 1; i >= 0; i--) {
            char currentDigit = value.charAt(i);
            if (!romanNumbers.containsKey(String.valueOf(currentDigit))) {
                return false;
            }
        }
        return true;
    }
}
