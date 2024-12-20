package com.Ex5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class String_CalculatorTest {

    @Test
    public void Tester_Chaine_Vide() {
        assertEquals(0, String_Calculator.calculer(""));
    }

    @Test
    public void Tester_Un_Nombre() {
        assertEquals(3, String_Calculator.calculer("3"));
    }

    @Test
    public void Tester_Deux_Nombres() {
        assertEquals(8, String_Calculator.calculer("3,5"));
    }

    @Test
    public void Tester_plusieure_Nombres() {
        assertEquals(22, String_Calculator.calculer("10,6,6"));
    }

    @Test
    public void Tester_Nouvelle_Ligne_Seperateur() {
        assertEquals(21, String_Calculator.calculer("5,5\n4,7"));
    }

}
