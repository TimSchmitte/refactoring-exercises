package com.realdolmen.refactoring.ex7;

import java.util.List;

public class Car extends Vehicle {
    private final double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public List<String> getSupportedFuelTypes() {
        return List.of("Diesel", "Gasoline");
    }

}

