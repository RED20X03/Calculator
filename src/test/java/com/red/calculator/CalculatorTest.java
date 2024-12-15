package com.red.calculator;


import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
void add() {
    Calculator calculator=new Calculator();
    assertThat(calculator.add(2,3)).isEqualTo(5);
        assertThat(calculator.add(10,3)).isEqualTo(13);
        assertThat(calculator.add(20,3)).isEqualTo(23);
}

    @Test
    void divide() {
        Calculator calculator=new Calculator();
        assertEquals(1,calculator.divide(3,2)," devrait donner 1 comme resultat");
        assertEquals(5,calculator.divide(10,2)," devrait donner 5 comme resultat");
        assertEquals(3,calculator.divide(6,2)," devrait donner 3 comme resultat");
    }
    }


