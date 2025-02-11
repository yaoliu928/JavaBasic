package com.al.car;

public class OceanCar {
    private String model;
    private String level;
    private String size;
    private double price;

    public int publicPower;

    private int power; // the same named variable with in the subclass

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void drive(){
        System.out.println(this.model+" is running on the road.");
    }

    public void show(){
        System.out.println("parent class power "+power);
    }
}
