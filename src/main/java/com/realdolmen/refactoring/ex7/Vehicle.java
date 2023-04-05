package com.realdolmen.refactoring.ex7;

import java.util.List;

public abstract class Vehicle {
    protected final String make;
    protected final String model;
    protected final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void accelerate() {
        System.out.println("accelerating");
    }

    public void brake() {
        System.out.println("braking");
    }

    public abstract List<String> getSupportedFuelTypes();

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
