package com.realdolmen.refactoring.ex3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CharacterUtilsTest {

    @ParameterizedTest
    @ValueSource(chars = {'a', 'e', 'i', 'o', 'u','y', 'A', 'E', 'I', 'O', 'U','Y'})
    void isAVowel(char c) {
        boolean result = CharacterUtils.isAVowel(c);
        assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(chars = {
        'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z',
        'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'})
    void isNotaVowel(char c) {
        boolean result = CharacterUtils.isAVowel(c);
        assertFalse(result);
    }
}