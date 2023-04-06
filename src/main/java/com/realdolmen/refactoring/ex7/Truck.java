package com.realdolmen.refactoring.ex7;

import java.util.List;

public class Truck extends Vehicle {
    private final double towingCapacity;

    public Truck(String make, String model, int year, double towingCapacity) {
        super(make, model, year);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public List<String> getSupportedFuelTypes(){
        return List.of("Diesel", "Gasoline", "LPG");
    }

}