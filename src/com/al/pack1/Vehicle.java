package com.al.pack1;

public class Vehicle {

    private String category;
    private  double speed;
    private static int count =0;

    public Vehicle() {
        count++;
    }

    public Vehicle(String category, double speed) {
        this.category = category;
        this.speed = speed;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
    }

    public void setCategory(String category){
        if(category != null && !category.isEmpty() && category.length()<=50){
            this.category=category;
        }else{
            System.out.println("category Error, default to car");
            this.category="car";
        }
    }

    public void setSpeed(double speed){
        switch (this.getCategory()) {
            case "car":
                if(speed>0 && speed<=200){
                    this.speed=speed;
                }else{
                    System.out.println("speed Error, default to 100");
                    this.speed=100;
                }
                break;
            case "airplane":
                if(speed>200 && speed <4000){
                    this.speed=speed;
                }else{
                    System.out.println("speed Error, default to 3000");
                    this.speed=4000;
                }
                break;
            default:
                if(speed>0){
                    this.speed=speed;
                }

        }


    }

    public String getCategory() {
        return category;
    }

    public double getSpeed() {
        return speed;
    }

    protected void showInfo(){
        System.out.println("category "+category);
        System.out.println("speed "+speed);
    }
}
