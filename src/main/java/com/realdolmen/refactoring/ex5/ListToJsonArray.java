package com.realdolmen.refactoring.ex5;

import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args) {
        List<String> words = List.of("Lorem", "ipsum", "dolor", "sit", "amet");

        String result = toJsonArray(words);

        System.out.println(result);
    }

    private static String toJsonArray(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder("[");

        for (String s : words) {
            stringBuilder
                .append("\"")
                .append(s)
                .append("\",");
        }

        String result = stringBuilder.toString();
        result = result.substring(0, result.length() - 1);
        result = result + "]";
        return result;
    }


}
