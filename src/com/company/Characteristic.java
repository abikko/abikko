package com.company;

public class Characteristic {
    private int tireRadius;
    private int type;
    private String modelEngine;
    private int power;

    public Characteristic(int radius, int type, String modelEngine, int power) {
        this.tireRadius = radius;
        this.type = type;
        this.modelEngine = modelEngine;
        this.power = power;
    }

    public int getTireRadius() {
        return tireRadius;
    }

    public void setTireRadius(int tireRadius) {
        this.tireRadius = tireRadius;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
