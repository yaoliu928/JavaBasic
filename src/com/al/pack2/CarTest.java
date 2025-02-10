package com.al.pack2;

import com.al.pack1.Car;

public class CarTest {

    public static void main(String[] args) {
        com.al.pack1.Car car = new com.al.pack1.Car("car", 160);
//        car.speed =200;

        car.setSpeed(-10);
        car.showInfo();

        com.al.pack2.Car plane = new com.al.pack2.Car("airplane", 1600);
        plane.setSpeed(1099);
        plane.showInfo();
    }

}
