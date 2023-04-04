package com.realdolmen.refactoring.ex7;

public class Truck {
    private String make;
    private String model;
    private int year;
    private double towingCapacity;

    public Truck(String make, String model, int year, double towingCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
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

    public double getTowingCapacity() {
        return towingCapacity;
    }
}