package com.realdolmen.refactoring.ex3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Stream.concat;

public class Grouper {
    private ConsonantCounter consonantCounter;

    public Grouper(ConsonantCounter consonantCounter) {
        this.consonantCounter = consonantCounter;
    }
    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        Map<Integer, List<String>> wordsByAmountOfUniqueCharacters = new HashMap<>();
        for (String word : words) {

            int u = consonantCounter.countUnique(word);

            wordsByAmountOfUniqueCharacters.merge(u, List.of(word), (value1, value2)
                -> concat(value1.stream(), value2.stream()).collect(Collectors.toList()));

        }

        return wordsByAmountOfUniqueCharacters;
    }
}
