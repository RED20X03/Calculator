package com.red.calculator;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUP(){
        calculator=new Calculator();
        System.out.println("SetUp");
    }

    @Test
void add() {
    assertThat(calculator.add(2,3)).isEqualTo(5);
        assertThat(calculator.add(2,13)).isEqualTo(15);
        assertEquals(0,calculator.add(-1,1),"-1+1 devrait donner 0 comme resultat");
        assertEquals(-5,calculator.add(-2,-3),"-2-3 devrait donner -5 comme resultat");
}

    @Test
    void divide() {
        Calculator calculator=new Calculator();
        assertEquals(1,calculator.divide(3,2)," devrait donner 1 comme resultat");
        assertEquals(5,calculator.divide(10,2)," devrait donner 5 comme resultat");
        assertEquals(3,calculator.divide(6,2)," devrait donner 3 comme resultat");
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "la division par 0 est impossible");
    }

    @AfterEach
    public void tearDown(){
        calculator=null;
        System.out.println("TearDown");

    }
    }


