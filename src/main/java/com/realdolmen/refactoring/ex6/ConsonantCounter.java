package com.realdolmen.refactoring.ex6;

import org.hibernate.engine.jdbc.CharacterStream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsonantCounter {
    private static boolean isWord(String word) {
        return word.matches("^[a-zA-Z]+$");
    }

    int countUniqueCharacters(String word) {
        if(!isWord(word)){
            throw new IllegalArgumentException(word + "is not a single word!");
        }

        return (int) word.chars()
            .mapToObj(c -> (char) c)
            .filter(ConsonantUtil::isAConsonant)
            .distinct()
            .count();
    }
}
