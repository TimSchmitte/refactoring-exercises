package com.realdolmen.refactoring.ex6;

public class ConsonantUtil {
    static boolean isAConsonant(char c) {
        return String.valueOf(c).matches("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]");
    }
}
