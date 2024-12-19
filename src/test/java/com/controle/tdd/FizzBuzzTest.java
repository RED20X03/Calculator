package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldReturnNumberWhenNotDivisibleBy3Or5() {
        assertThat(FizzBuzz.de(1)).isEqualTo("1");

    }
    @Test
    void shouldReturnFizzWhenDivisibleBy3() {
        assertThat(FizzBuzz.de(3)).isEqualTo("Fizz");
    }
    @Test
    void shouldReturnBuzzWhenDivisibleBy5() {
        assertThat(FizzBuzz.de(5)).isEqualTo("Buzz");
    }
    @Test
    void shouldReturnFizzBuzzWhenDivisibleBy3And5() {
        assertThat(FizzBuzz.de(15)).isEqualTo("FizzBuzz"); // Test échouera
    }
}
