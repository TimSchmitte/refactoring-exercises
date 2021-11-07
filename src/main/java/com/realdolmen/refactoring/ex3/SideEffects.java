package com.realdolmen.refactoring.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SideEffects {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        URL resource = Objects.requireNonNull(SideEffects.class.getResource("/loremipsum.txt"));
        File file = new File(resource.toURI());

        Map<String, Long> frequency = new HashMap<>();
        calculateWordFrequency(frequency, file);

        print(frequency);
    }

    private static void calculateWordFrequency(Map<String, Long> frequency, File filePath) throws FileNotFoundException {
        try (Stream<String> words = new Scanner(filePath).tokens()) {
            words.forEach(word -> frequency.merge(word.toLowerCase(), 1L, Long::sum));
        }
    }

    private static void print(Map<String, Long> frequency) {
        System.out.println(frequency);
    }
}
