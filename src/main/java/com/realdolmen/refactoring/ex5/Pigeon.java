package com.realdolmen.refactoring.ex5;

public class Pigeon {

    private String stomachContents;
    private final double flightSpeedPerHour;
    private double kmFlown = 0.0;

    public Pigeon(double flightSpeedPerHour) {
        this.flightSpeedPerHour = flightSpeedPerHour;
    }

    public void fly(double km){
        System.out.println("flying " + km + "km, will arrive in " + km/flightSpeedPerHour + " hours"  );
        kmFlown += km;
    }

    public double getKmFlown() {
        return kmFlown;
    }

    public void ingest(String consumable) {
        if (stomachContents == null) {
            stomachContents = consumable;
            System.out.println("ingest " + consumable);
        } else {
            throw new StomachFullException();
        }
    }

    public void digest() {
        if (stomachContents == null) {
            throw new NothingToDigestException();
        }
        System.out.println("digested " + stomachContents);
        stomachContents = null;
    }

    public String getStomachContents() {
        return stomachContents;
    }
}
