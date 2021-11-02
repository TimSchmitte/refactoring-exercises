package com.realdolmen.refactoring.ex3;

import java.util.*;
import java.util.stream.Collectors;

public class Grouper {
    private ConsonantCounter consonantCounter;

    public Grouper(ConsonantCounter consonantCounter) {
        this.consonantCounter = consonantCounter;
    }
    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        return words.stream()
            .collect(Collectors.groupingBy(word -> consonantCounter.countUnique(word)));
    }
}
