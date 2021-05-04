package com.ironhack.labs.jasato.oop;

public class Vehicle {

    private int horsePower;
    private int cubicCentimeters;
    private double topSpeed;
    private String brand;
    private String model;
    private double speed = 0;

    public Vehicle(int horsePower, int cubicCentimeters, double topSpeed, String brand, String model) {
        this.horsePower = horsePower;
        this.cubicCentimeters = cubicCentimeters;
        this.topSpeed = topSpeed;
        this.brand = brand;
        this.model = model;
    }

    // Method overload
    public void increaseSpeed() {
        if (this.topSpeed < this.speed + 10) this.speed += 10;

    }
    public void increaseSpeed(int speed) {
        if (this.topSpeed < this.speed + speed) this.speed += speed;
    }

    public void decreaseSpeed() {
        if ( this.speed - 10 > 0) this.speed -= 10;

    }

    public void decreaseSpeed(int speed) {
        if ( this.speed - speed > 0) this.speed -= speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCubicCentimeters() {
        return cubicCentimeters;
    }

    //Explain that you can set rules to control the behaviour
    // of the attributes, e.g. by setting a min. of 0 for cubicCentimeters

    public void setCubicCentimeters(int cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
