package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    // Test pour vérifier que FizzBuzz.de(1) retourne "1"
    @Test
    void shouldReturnNumberWhenNotDivisibleBy3Or5() {
        assertThat(FizzBuzz.de(1)).isEqualTo("1");
    }
}
