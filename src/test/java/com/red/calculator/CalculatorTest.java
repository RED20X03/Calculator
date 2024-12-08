package com.red.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    public void setUp() {
        System.out.println("SetUp");
    }

    @Test
    void add() {
        assertThat(Calculator.add(2, 3)).isEqualTo(5);
        assertThat(Calculator.add(2, 13)).isEqualTo(15);
        assertEquals(0, Calculator.add(-1, 1), "-1 + 1 devrait donner 0 comme résultat");
        assertEquals(-5, Calculator.add(-2, -3), "-2 + (-3) devrait donner -5 comme résultat");
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
