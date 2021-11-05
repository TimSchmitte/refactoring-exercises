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
        return words.stream()
            .collect(Collectors.groupingBy(word -> consonantCounter.countUnique(word)));
    }
}
