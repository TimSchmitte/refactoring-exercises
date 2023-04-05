package com.realdolmen.refactoring.ex6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

public class ConsonantUtilTest {

    @ParameterizedTest
    @ValueSource(chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'})
    public void testIsAConsonant_withConsonants(char consonant) {
        assertThat(ConsonantUtil.isAConsonant(consonant)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(chars = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'})
    public void testIsAConsonant_withVowels(char vowel) {
        assertThat(ConsonantUtil.isAConsonant(vowel)).isFalse();
    }

    @Test
    public void testIsAConsonant_withNonLetter() {
        assertThat(ConsonantUtil.isAConsonant('1')).isFalse();
    }

    @Test
    public void testIsAConsonant_withWhitespace() {
        assertThat(ConsonantUtil.isAConsonant(' ')).isFalse();
        assertThat(ConsonantUtil.isAConsonant('\n')).isFalse();
        assertThat(ConsonantUtil.isAConsonant('\t')).isFalse();
    }
}