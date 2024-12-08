package com.red.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    public void setUp() {
        System.out.println("SetUp");
    }

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
        assertEquals(1, Calculator.divide(3, 2), "Devrait donner 1 comme résultat");
        assertEquals(5, Calculator.divide(10, 2), "Devrait donner 5 comme résultat");
        assertEquals(3, Calculator.divide(6, 2), "Devrait donner 3 comme résultat");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("TearDown");
    }
}
