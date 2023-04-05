package com.realdolmen.refactoring.ex8;

public abstract class Vehicle {
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void brake() {
        // code to brake
    }

    public abstract void accelerate();

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
