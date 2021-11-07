package com.realdolmen.refactoring.ex4;

public class PizzaDelivery {
    int numberOfLateDeliveries;

    public PizzaDelivery(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }

}