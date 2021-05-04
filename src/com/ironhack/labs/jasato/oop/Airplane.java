package com.ironhack.labs.jasato.oop;

public class Airplane implements Flyable{

    private boolean landingGearOpen;
    private double altitude;
    private double speed;

    @Override
    public void takeOff() {
        setAltitude(100.0);
        setLandingGearOpen(false);

    }

    @Override
    public void land() {
        setLandingGearOpen(true);
        setAltitude(0.0);

    }

    @Override
    public void increaseSpeed(double speed) {
        this.speed += speed;

    }

    @Override
    public void decreaseSpeed(double speed) {
        this.speed -= speed;

    }

    public boolean isLandingGearOpen() {
        return landingGearOpen;
    }

    public void setLandingGearOpen(boolean landingGearOpen) {
        this.landingGearOpen = landingGearOpen;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
