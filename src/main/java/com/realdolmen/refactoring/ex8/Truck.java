package com.realdolmen.refactoring.ex8;

public class Truck extends Vehicle {
    private double towingCapacity;

    public Truck(String make, String model, int year, int fuelCapacity, int currentFuel, double towingCapacity) {
        super(make, model, year, fuelCapacity, currentFuel);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }
}