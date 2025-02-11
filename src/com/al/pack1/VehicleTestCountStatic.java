package com.al.pack1;

public class VehicleTestCountStatic {
    public static void main(String[] args) {

        Vehicle car1=new Vehicle();
        Vehicle car2=new Vehicle();
        Vehicle car3=new Vehicle();

        System.out.println("count "+Vehicle.getCount());
    }
}
