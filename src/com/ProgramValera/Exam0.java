package com.ProgramValera;
import java.util.Scanner;

public class Exam0 {
    public static void processing(){
        Exam0.Calculation();
    }
    private static void Calculation(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is year today?");
        int yearToday = scanner.nextInt();

        System.out.println("When you were born?");
        int yearBorn = scanner.nextInt();


        int result = yearToday-yearBorn;
        System.out.println("You are " + result + " years old!");
    }
}
