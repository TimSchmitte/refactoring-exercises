package com.realdolmen.refactoring.ex4;

public class PizzaDelivery {
    int numberOfLateDeliveries;

    public PizzaDelivery(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}