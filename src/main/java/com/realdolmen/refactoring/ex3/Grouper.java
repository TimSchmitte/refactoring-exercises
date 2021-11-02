package com.realdolmen.refactoring.ex3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Stream.concat;

public class Grouper {
    public Map<Integer, List<String>> groupByAmountOfUniqueConsonants(List<String> words){
        Map<Integer, List<String>> wordsByAmountOfUniqueCharacters = new HashMap<>();
        for (String word : words) {

            if(!word.matches("^[a-zA-Z]+$")){
                throw new IllegalArgumentException(word + "is not a single word!");
            }
            Set<Character> chars = new HashSet<>();
            int u = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y'){
                    if(!chars.contains(c)){
                        chars.add(c);
                        u++;
                    }
                }

            }
            wordsByAmountOfUniqueCharacters.merge(u, List.of(word), (value1, value2)
                -> concat(value1.stream(), value2.stream()).collect(Collectors.toList()));
        }

        return wordsByAmountOfUniqueCharacters;
    }

}
