package com.ironhack.labs.jasato.oop;

public class Bird implements Flyable{

    private double wingsSpeed;
    private double altitude;


    @Override
    public void takeOff() {
        moveWings();
        setAltitude(100.0);

    }

    @Override
    public void land() {
        glide();
        setAltitude(0.0);

    }

    @Override
    public void increaseSpeed(double speed) {
        setWingsSpeed(speed);

    }

    @Override
    public void decreaseSpeed(double speed) {
        setWingsSpeed(speed);

    }

    private void moveWings() {
    }

    private void glide() {
    }

    public double getWingsSpeed() {
        return wingsSpeed;
    }

    public void setWingsSpeed(double wingsSpeed) {
        this.wingsSpeed = wingsSpeed;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
}
