package com.realdolmen.refactoring.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class SideEffects {
    public static void main(String[] args, String filePath) throws FileNotFoundException {
        Map<String, Long> frequency = new HashMap<>();
        calculateWordFrequency(filePath, frequency);
        System.out.println(frequency);
    }

    private static void calculateWordFrequency(String filePath, Map<String, Long> frequency) throws FileNotFoundException {
        try (Stream<String> words = new Scanner(new File(filePath)).tokens()) {
            words.forEach(word -> frequency.merge(word.toLowerCase(), 1L, Long::sum));
        }
    }
}
