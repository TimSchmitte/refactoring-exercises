package com.realdolmen.refactoring.ex7;

import java.util.List;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.trunkSize = trunkSize;
    }

    public void accelerate() {
        System.out.println("accelerating");
    }

    public void brake() {
        System.out.println("braking");
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public List<String> getSupportedFuelTypes(){
        return List.of("Diesel", "Gasoline");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

