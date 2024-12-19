package com.red.EX3Tp2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ArabicRomanNumeralsTest {

    @Test
    void testConvertSimpleNumbers() {
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
        assertThat(ArabicRomanNumerals.convert(3)).isEqualTo("III");
        assertThat(ArabicRomanNumerals.convert(5)).isEqualTo("V");
    }


}
