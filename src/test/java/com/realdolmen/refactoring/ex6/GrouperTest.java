package com.realdolmen.refactoring.ex6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class GrouperTest {
    @Test
    void validInput() {
        Grouper grouper = new Grouper();
        List<String> words = List.of("Refactoring", "A", "Never", "ending", "journey", "towards", "perfection");
        Map<Integer, List<String>> wordsByAmountOfUniqueConsonants = grouper.groupByAmountOfUniqueConsonants(words);


        System.out.println(wordsByAmountOfUniqueConsonants);
        Assertions.assertThat(wordsByAmountOfUniqueConsonants)
            .hasSize(5)
            .containsEntry(0, List.of("A"))
            .containsEntry(3, List.of("Never","ending", "journey"))
            .containsEntry(5, List.of("towards"))
            .containsEntry(6, List.of("perfection"))
            .containsEntry(7, List.of("Refactoring"));
    }

    @Test
    void invalidWord() {
        Grouper grouper = new Grouper();
        List<String> words = List.of("Refactoring", "A Never-ending journey towards perfection");

        Assertions.assertThatThrownBy(() ->grouper.groupByAmountOfUniqueConsonants(words));

    }

    @Test
    void testVowels(){
        Grouper grouper = new Grouper();
        Assertions.assertThat(grouper.groupByAmountOfUniqueConsonants(List.of("abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ")))
            .containsEntry(20, List.of("abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
