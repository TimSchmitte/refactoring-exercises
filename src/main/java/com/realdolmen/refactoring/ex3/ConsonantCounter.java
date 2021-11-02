package com.realdolmen.refactoring.ex3;

import java.util.HashSet;
import java.util.Set;

public class ConsonantCounter {
    int countUnique(String word) {
        if(!isAWord(word)){
            throw new IllegalArgumentException(word + "is not a single word!");
        }

        return (int)word.chars().mapToObj(c -> (char)c)
            .filter(c1 -> !CharacterUtils.isAVowel(c1))
            .distinct()
            .count();
    }
    private boolean isAWord(String word) {
        return word.matches("^[a-zA-Z]+$");
    }

}
