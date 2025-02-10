package com.al.pack1;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car("car", 160);
//        car.speed =200;

        car.setSpeed(-10);
        car.showInfo();

        Car plane = new Car("airplane", 1600);
        plane.setSpeed(1099);
        plane.showInfo();
    }

}
