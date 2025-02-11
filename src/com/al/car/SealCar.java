package com.al.car;

public class SealCar extends OceanCar {
    private int power = 530;

    public void show() {
        System.out.println("power " + power);
        // inherit from parent class
        System.out.println("parent class power " + super.power);
    }
}
