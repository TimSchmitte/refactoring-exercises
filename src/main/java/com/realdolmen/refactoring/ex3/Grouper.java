package com.realdolmen.refactoring.ex3;

import java.util.*;

public class Grouper {
    private ConsonantCounter consonantCounter;

    public Grouper(ConsonantCounter consonantCounter) {
        this.consonantCounter = consonantCounter;
    }

    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        Map<Integer, List<String>> wordsByAmountOfUniqueCharacters = new HashMap<>();
        for (String word : words) {
            int u = consonantCounter.countUnique(word);
            wordsByAmountOfUniqueCharacters.compute(u, (key, value) -> {
                if (value == null) {
                    return List.of(word);
                }else {
                    List<String> res = new ArrayList<>(value);
                    res.add(word);
                    return res;
                }
            });

        }

        return wordsByAmountOfUniqueCharacters;
    }
}
