package com.realdolmen.refactoring.ex3;

import java.util.Set;

public class CharacterUtils {
    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'y');
    static boolean isAVowel(char c) {
        return vowels.contains(Character.toLowerCase(c));
    }
}
