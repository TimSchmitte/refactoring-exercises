package com.realdolmen.refactoring.ex8;

public class Truck extends Vehicle {
    private final int fuelCapacity;
    private double towingCapacity;
    private int currentFuel;

    public Truck(String make, String model, int year, int fuelCapacity, int currentFuel, double towingCapacity) {
        super(make, model, year);
        this.towingCapacity = towingCapacity;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void refuel() {
        currentFuel = fuelCapacity;
    }

    @Override
    public void accelerate() {
        currentFuel--;
    }
}