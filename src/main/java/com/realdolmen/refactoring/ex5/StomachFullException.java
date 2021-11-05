package com.realdolmen.refactoring.ex5;

public class StomachFullException extends RuntimeException {
    public StomachFullException() {
        super("Stomach is full, please digest first!");
    }
}
