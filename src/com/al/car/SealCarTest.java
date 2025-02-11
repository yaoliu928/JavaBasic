package com.al.car;

public class SealCarTest {
    public static void main(String[] args) {
        SealCar seal1 = new SealCar();
        SealCar seal2 = new SealCar();
//        seal1.setModel("black version");
//        seal1.drive();
//        seal1.show();
        System.out.println(seal1);
        System.out.println("seal1 is equal to seal2 ? " + seal1.equals(seal2));

        String name1="name";
        String name2="name";
        // equals of String has been override, so it's different fromw the equals of Object class
        System.out.println("name1 is equal to name2 ? " + name1.equals(name2));
    }
}
