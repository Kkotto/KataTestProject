package com.kkotto;

enum RomanNumber {
    ONE(1, "I"),
    TWO(2, "II"),
    THREE(3, "III"),
    FOUR(4, "IV"),
    FIVE(5, "V"),
    SIX(6, "VI"),
    SEVEN(7, "VII"),
    EIGHT(8, "VIII"),
    NINE(9, "IX"),
    TEN(10, "X"),
    ELEVEN(11, "XI"),
    TWELVE(12, "XII"),
    THIRTEEN(13, "XIII"),
    FOURTEEN(14, "XIV"),
    FIFTEEN(15, "XV"),
    SIXTEEN(16, "XVI"),
    SEVENTEEN(17, "XVII"),
    EIGHTEEN(18, "XVIII"),
    NINETEEN(19, "XIX"),
    TWENTY(20, "XX");
    private final int arabicValue;
    private final String romanValue;

    RomanNumber(int arabicValue, String romanValue) {
        this.arabicValue = arabicValue;
        this.romanValue = romanValue;
    }

    public String getRomanValue() {
        return romanValue;
    }

    public int getArabicValue() {
        return arabicValue;
    }

    public static int convertToArabic(String value) {
        for (RomanNumber number : RomanNumber.values()) {
            if (number.getRomanValue().equals(value)) {
                return number.arabicValue;
            }
        }
        return Constant.INCORRECT_VALUE;
    }

    public static String convertToRoman(int value) {
        for (RomanNumber number : RomanNumber.values()) {
            if (number.getArabicValue() == value) {
                return number.romanValue;
            }
        }
        return Constant.DEFAULT_STRING_VALUE;
    }
}
