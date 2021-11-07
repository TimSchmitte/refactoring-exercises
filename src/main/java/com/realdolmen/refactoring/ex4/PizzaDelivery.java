package com.realdolmen.refactoring.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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