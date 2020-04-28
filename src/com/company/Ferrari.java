package com.company;

public class Ferrari extends Characteristic {
    private String modelCar;
    private int price;

    public Ferrari(int radius, int type, String modelEngine, int power, String modelCar, int price) {
        super(radius, type, modelEngine, power);
        this.modelCar = modelCar;
        this.price = price;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
