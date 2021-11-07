package com.realdolmen.refactoring.ex10;

import com.realdolmen.refactoring.ex10.ConsonantCounter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsonantCounterTest {

    private ConsonantCounter consonantCounter;

    @BeforeEach
    void setUp() {
        consonantCounter = new ConsonantCounter();
    }

    @ParameterizedTest
    @CsvSource(value = {"Refactoring, 7", "A, 0", "Never, 3", "ending, 3", "journey, 3", "towards, 5", "perfection, 6"})
    void countUnique(String word, int count) {
        Assertions.assertThat(consonantCounter.countUnique(word)).isEqualTo(count);
    }

    @Test
    void notAWord() {
        Assertions.assertThatThrownBy(() ->consonantCounter.countUnique("this is not a word"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("is not a single word!");
    }
}