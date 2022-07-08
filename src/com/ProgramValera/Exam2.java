package com.ProgramValera;
import java.util.Scanner;


public class Exam2 extends Loops {
    public static void processing(){
        Exam2.defineRangeNumber();
    }
    private static void defineRangeNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number < 100) {
            System.out.println("for exit input number 100 or more");
            System.out.print("Input any number: ");
            number = scanner.nextInt();
            if (number >= 0 && number <= 10) {
                System.out.println("Number is positive or zero  include");
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("number more then 10");
            }
        }
        System.out.print("Bay bay");

    }

}

