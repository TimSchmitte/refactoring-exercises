package com.realdolmen.refactoring.ex8;

public class Car extends Vehicle {
    private final int fuelCapacity;
    private double trunkSize;
    private int currentFuel;

    public Car(String make, String model, int year, double trunkSize, int fuelCapacity, int currentFuel) {
        super(make, model, year);
        this.trunkSize = trunkSize;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }


    public double getTrunkSize() {
        return trunkSize;
    }

    public void refuel() {
        currentFuel = fuelCapacity;
    }

    @Override
    public void accelerate() {
        currentFuel--;
    }
}

