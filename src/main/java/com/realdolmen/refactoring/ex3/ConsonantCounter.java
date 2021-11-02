package com.realdolmen.refactoring.ex3;

import java.util.HashSet;
import java.util.Set;

public class ConsonantCounter {
    int countUnique(String word) {
        if(!isAWord(word)){
            throw new IllegalArgumentException(word + "is not a single word!");
        }
        Set<Character> chars = new HashSet<>();
        int u = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(!CharacterUtils.isAVowel(c)){
                if(!chars.contains(c)){
                    chars.add(c);
                    u++;
                }
            }

        }
        return u;
    }
    private boolean isAWord(String word) {
        return word.matches("^[a-zA-Z]+$");
    }

}
