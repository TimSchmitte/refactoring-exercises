package com.realdolmen.refactoring.ex8;

public class Vehicle {
    protected int amountOfDoors;

    public Vehicle(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }
}
