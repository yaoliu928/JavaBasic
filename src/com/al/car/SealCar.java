package com.al.car;

public class SealCar extends OceanCar {
    private int power = 530;

    @Override
    public String toString() {
        return "SealCar{" +
                "power=" + power +
                '}';
    }

    public SealCar() {
        super("white model");
        System.out.println("child constructor");
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public void show() {
        super.show();
        System.out.println("child power " + power);
        // inherit from parent class
        System.out.println("parent public class power " + super.publicPower);
    }


    public static void charge(){
        System.out.println("in charging...");
    }

}
