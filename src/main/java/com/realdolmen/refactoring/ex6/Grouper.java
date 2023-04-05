package com.realdolmen.refactoring.ex6;

import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.stream.Stream.concat;

public class Grouper {
    private final ConsonantCounter consonantCounter;

    public Grouper(ConsonantCounter consonantCounter) {
        this.consonantCounter = consonantCounter;
    }

    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        Map<Integer, List<String>> wordsByAmountOfUniqueCharacters = new HashMap<>();
        for (String word : words) {
            int u = consonantCounter.countUniqueCharacters(word);
            wordsByAmountOfUniqueCharacters.merge(u, List.of(word), (origWords, newWords)
                -> concat(origWords.stream(), newWords.stream()).collect(toList()));
        }

        return wordsByAmountOfUniqueCharacters;
    }

}
