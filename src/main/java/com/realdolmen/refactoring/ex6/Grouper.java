package com.realdolmen.refactoring.ex6;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Stream.concat;

public class Grouper {
    private final ConsonantCounter consonantCounter;

    public Grouper(ConsonantCounter consonantCounter) {
        this.consonantCounter = consonantCounter;
    }

    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words) {
        return words.stream()
            .collect(Collectors.toMap(
                consonantCounter::countUniqueCharacters, List::of,
                (w1, w2) -> concat(w1.stream(), w2.stream()).toList()));
    }

}
