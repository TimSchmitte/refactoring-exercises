package com.realdolmen.refactoring.ex6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ConsonantCounterTest {

    private ConsonantCounter consonantCounter;

    @BeforeEach
    void setUp() {
        consonantCounter = new ConsonantCounter();
    }

    @Test
    void countUniqueCharacters() {
        assertThat(consonantCounter.countUniqueCharacters("e"))
            .isEqualTo(0);
        assertThat(consonantCounter.countUniqueCharacters("Test"))
            .isEqualTo(3);
        assertThat(consonantCounter.countUniqueCharacters("Extract"))
            .isEqualTo(4);
        assertThat(consonantCounter.countUniqueCharacters("ConsonantCounter"))
            .isEqualTo(5);
    }


    @Test
    void throwWhenNotAWord() {
        assertThatThrownBy(() -> consonantCounter.countUniqueCharacters("Test 123"))
            .isInstanceOf(IllegalArgumentException.class);
    }
}