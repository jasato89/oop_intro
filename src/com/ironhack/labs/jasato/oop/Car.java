package com.ironhack.labs.jasato.oop;


public class Car extends Vehicle{


    private int numDoors;
    private boolean doorsLocked = true;


    public Car(int horsePower, int cubicCentimeters, double topSpeed, String brand, String model, int numDoors) {
        super(horsePower, cubicCentimeters, topSpeed, brand, model);
        this.numDoors = numDoors;
    }

    public void lockDoors() {
        this.doorsLocked = true;
    }

    public void unlockDoors() {
        this.doorsLocked = false;
    }

    public boolean isDoorsLocked() {
        return doorsLocked;
    }

    public void setDoorsLocked(boolean doorsLocked) {
        this.doorsLocked = doorsLocked;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
