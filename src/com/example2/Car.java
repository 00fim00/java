package com.example2;

public class Car {
    public void start(){}
    public void stop(){}
    public static int drive(int howlong) {
        int distance;
        distance = howlong * 60;
        System.out.println(distance);
        return distance;
    }

}
