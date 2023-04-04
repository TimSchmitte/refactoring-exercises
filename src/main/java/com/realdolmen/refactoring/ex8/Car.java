package com.realdolmen.refactoring.ex8;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;
    private double trunkSize;

    public Car(String make, String model, int year, int amountOfDoors, double trunkSize) {
        super(amountOfDoors);
        this.make = make;
        this.model = model;
        this.year = year;
        this.trunkSize = trunkSize;
    }

    public double calculateFuelEfficiency() {
        // code to calculate fuel efficiency
        return 0.0;
    }

    public double calculateEmissions() {
        // code to calculate emissions
        return 0.0;
    }

    public void accelerate() {
        // code to accelerate
    }

    public void brake() {
        // code to brake
    }

}

