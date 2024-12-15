package com.red.calculator;

import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testEnsembleChiffres() {
        // Test avec un nombre positif
        Set<Integer> result1 = Calculator.ensembleChiffres(7679);
        assertEquals(Set.of(6, 7, 9), result1, "Les chiffres de 7679 doivent être {6, 7, 9}");

        // Test avec un nombre négatif (devrait ignorer le signe)
        Set<Integer> result2 = Calculator.ensembleChiffres(-11);
        assertEquals(Set.of(1), result2, "Les chiffres de -11 doivent être {1}");

        // Test avec un nombre à un seul chiffre
        Set<Integer> result3 = Calculator.ensembleChiffres(3);
        assertEquals(Set.of(3), result3, "Les chiffres de 3 doivent être {3}");

        // Test avec un nombre ayant des chiffres répétitifs
        Set<Integer> result4 = Calculator.ensembleChiffres(100110);
        assertEquals(Set.of(0, 1), result4, "Les chiffres de 100110 doivent être {0, 1}");

    }

    Calculator calculator;
    @BeforeEach
    public void setUP(){
        System.out.println("SetUp");
    }
    // Test paramétré pour l'addition
    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",   // 0 + 1 = 1
            "1, 2, 3",   // 1 + 2 = 3
            "-2, 2, 0",  // -2 + 2 = 0
            "0, 0, 0",   // 0 + 0 = 0
            "-1, -2, -3" // -1 + -2 = -3
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, Calculator.add(a, b), "Addition incorrecte");
    }


    @Test
    void divide() {
        assertEquals(1, Calculator.divide(3,2)," devrait donner 1 comme resultat");
        assertEquals(5, Calculator.divide(10,2)," devrait donner 5 comme resultat");
        assertEquals(3, Calculator.divide(6,2)," devrait donner 3 comme resultat");
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1, 0), "la division par 0 est impossible");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("TearDown");

    }
    }


