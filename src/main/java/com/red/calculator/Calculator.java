package com.red.calculator;

public class Calculator {

    public  static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return opG / opD;
    }

}
