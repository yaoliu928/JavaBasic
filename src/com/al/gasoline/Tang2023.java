package com.al.gasoline;

public class Tang2023 extends Tang{
    // Explicit Initialization
    final String MODEL="TANG";
    // Constructor Initialization
    final int YEAR;

    {
        // Constructor block, initializing member variables modified by final
        this.YEAR=2024;
    }

//    public Tang2023(int YEAR) {
//        this.YEAR = YEAR;
//    }

    public void show2023() {
        System.out.println("this gasoline car has been depracated");
    }
}
