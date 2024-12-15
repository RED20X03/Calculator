package com.red.calculator;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUP(){
        calculator=new Calculator();
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
        calculator=null;
        System.out.println("TearDown");

    }
    }


