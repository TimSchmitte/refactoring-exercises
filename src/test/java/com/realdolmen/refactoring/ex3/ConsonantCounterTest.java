package com.realdolmen.refactoring.ex3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantCounterTest {

    @ParameterizedTest
    @CsvSource(value = {"Refactoring, 7", "A, 0", "Never, 3", "ending, 3", "journey, 3", "towards, 5", "perfection, 6"})
    void countUnique(String word, int count) {
        ConsonantCounter consonantCounter = new ConsonantCounter();
        Assertions.assertThat(consonantCounter.countUnique(word)).isEqualTo(count);
    }
}