package com.controle.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "4, 4",
            "5, Buzz",
            "6, Fizz",
            "7, 7",
            "8, 8",
            "9, Fizz",
            "10, Buzz",
            "11, 11",
            "12, Fizz",
            "13, 13",
            "14, 14",
            "15, FizzBuzz",
            "16, 16",
            "17, 17",
            "18, Fizz",
            "19, 19",
            "20, Buzz"
    })
    void shouldReturnCorrectFizzBuzzOutput(int input, String expected) {
        assertThat(FizzBuzz.de(input)).isEqualTo(expected);
    }
}
