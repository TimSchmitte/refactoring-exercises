package com.realdolmen.refactoring.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.stream.Stream;

public class SideEffects {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        URL resource = Objects.requireNonNull(SideEffects.class.getResource("/loremipsum.txt"));
        File file = new File(resource.toURI());

        Map<String, Long> frequency = calculateWordFrequency(file);

        print(frequency);
    }

    private static Map<String, Long> calculateWordFrequency(File file) throws FileNotFoundException {
        Map<String, Long> frequency = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word -> frequency.merge(word.toLowerCase(), 1L, Long::sum));
        }
        return frequency;
    }

    private static void print(Map<String, Long> frequency) {
        System.out.println(frequency);
    }
}
