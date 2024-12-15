package com.red.calculator;
import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();

        String strNombre = String.valueOf(Math.abs(pNombre));

        for (char c : strNombre.toCharArray()) {
            chiffres.add(Character.getNumericValue(c));
        }

        return chiffres;
    }
}
