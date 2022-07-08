package com.Massivi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Massivi mass = new Massivi();
//    mass.foo();
//        int[] arr = new int[4];
//        Scanner scan = new Scanner(System.in);
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print("Введите значание: ");
//            int value = scan.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("Minimal: " + min);

        int[] arr = new int[] {1,2,3};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
