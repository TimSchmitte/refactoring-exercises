package com.realdolmen.refactoring.ex3;

import java.util.*;

public class Grouper {
    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        Map<Integer, List<String>> wordsByAmountOfUniqueCharacters = new HashMap<>();
        for (String word : words) {

            if(!isAWord(word)){
                throw new IllegalArgumentException(word + "is not a single word!");
            }
            Set<Character> chars = new HashSet<>();
            int u = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if(isAVowel(c)){
                    if(!chars.contains(c)){
                        chars.add(c);
                        u++;
                    }
                }

            }
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

    private static boolean isAVowel(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y';
    }

    private boolean isAWord(String word) {
        return word.matches("^[a-zA-Z]+$");
    }

}
