package com.realdolmen.refactoring.ex8;

public class Truck {
    private String make;
    private String model;
    private int year;
    private int amountOfDoors;
    private double towingCapacity;

    public Truck(String make, String model, int year, int amountOfDoors, double towingCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
        this.towingCapacity = towingCapacity;
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

    public int getAmountOfDoors() {
        return amountOfDoors;
    }
}