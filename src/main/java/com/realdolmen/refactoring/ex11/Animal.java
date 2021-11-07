package com.realdolmen.refactoring.ex11;

public abstract class Animal {
    protected String stomachContents;

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
}
