package com.HowManyYearsOld;
import java.util.Scanner;

public class Count {
    public static void processing(){
        Count.Calculation();
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
