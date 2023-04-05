package com.realdolmen.refactoring.ex8;

public class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final int fuelCapacity;
    private int currentFuel;

    public Vehicle(String make, String model, int year, int fuelCapacity, int currentFuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public void refuel() {
        currentFuel = fuelCapacity;
    }

    public void brake() {
        // code to brake
    }

    public void accelerate() {
        currentFuel--;
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
