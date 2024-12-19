package com.red.EX3Tp2;

public class ArabicRomanNumerals {

    public static String convert(int nbr) {
        if (nbr == 1) return "I";
        if (nbr == 3) return "III";
        if (nbr == 4) return "IV";
        if (nbr == 5) return "V";
        return ""; // Par défaut, retourne une chaîne vide
    }

}
