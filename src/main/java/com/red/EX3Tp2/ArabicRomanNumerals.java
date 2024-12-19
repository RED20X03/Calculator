package com.red.EX3Tp2;

public class ArabicRomanNumerals {

    public static String convert(int nbr) {
        if (nbr < 1 || nbr > 50) {
            throw new IllegalArgumentException("Number must be between 1 and 50");
        }

        StringBuilder roman = new StringBuilder();
        int[] arabic = {50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < arabic.length; i++) {
            while (nbr >= arabic[i]) {
                roman.append(romanNumerals[i]);
                nbr -= arabic[i];
            }
        }
        return roman.toString();
    }
}