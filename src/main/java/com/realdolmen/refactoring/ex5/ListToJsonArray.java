package com.realdolmen.refactoring.ex5;

import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args) {
        List<String> words = List.of("Lorem", "ipsum", "dolor", "sit", "amet");

        String result = toJsonArray(words);
        result = result.substring(0, result.length() - 1);
        result = result + "]";

        System.out.println(result);
    }


    private static String toJsonArray(List<String> strings){
        StringBuilder stringBuilder = new StringBuilder("[");

        for (String s : strings) {
            stringBuilder
                .append("\"")
                .append(s)
                .append("\",");
        }

        return stringBuilder.toString();
    }
}
