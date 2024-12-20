package com.Ex5;
public class String_Calculator {
    public static int calculer(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(",|\n");
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }

        return sum;
    }
}

