package com.example2;
public class JamesBondCar extends Car {
        public static int drive(int howlong) {
            int distance;
            distance = howlong * 180;
            System.out.println(distance);
            return distance;
        }
}
