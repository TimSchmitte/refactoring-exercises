package com.realdolmen.refactoring.ex7;

import java.util.List;

public class Truck {
    private final String make;
    private final String model;
    private final int year;
    private final double towingCapacity;

    public Truck(String make, String model, int year, double towingCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.towingCapacity = towingCapacity;
    }

    public void accelerate() {
        System.out.println("accelerating");
    }

    public void brake() {
        System.out.println("braking");
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public List<String> getSupportedFuelTypes(){
        return List.of("Diesel", "Gasoline", "LPG");
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