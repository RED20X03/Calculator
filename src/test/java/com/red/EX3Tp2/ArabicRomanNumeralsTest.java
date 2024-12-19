package com.red.EX3Tp2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ArabicRomanNumeralsTest {

    @Test
    void testConvertSimpleNumbers() {
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
        assertThat(ArabicRomanNumerals.convert(3)).isEqualTo("III");
        assertThat(ArabicRomanNumerals.convert(5)).isEqualTo("V");
    }

    @Test
    void testConvertComplexNumbers() {
        assertThat(ArabicRomanNumerals.convert(4)).isEqualTo("IV");
        assertThat(ArabicRomanNumerals.convert(9)).isEqualTo("IX");
        assertThat(ArabicRomanNumerals.convert(39)).isEqualTo("XXXIX");
        assertThat(ArabicRomanNumerals.convert(50)).isEqualTo("L");
    }

}
