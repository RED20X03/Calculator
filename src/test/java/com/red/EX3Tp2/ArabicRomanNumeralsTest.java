package com.red.EX3Tp2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {

    @Test
    void testConvert1() {
        assertEquals("I", ArabicRomanNumerals.convert(1)); // le test va passer 
    }
}



