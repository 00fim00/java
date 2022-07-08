package com.ProgramValera;

import java.util.Scanner;

public class Exam4 extends Arrays{
    public static void processing(){
        Exam4.DayOfWeek2();
    }
    private static void DayOfWeek2 (){
        System.out.println("Input number of week(input number 1-7): ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String [] weekDays = new String[]{"no day","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(weekDays[index]);
    }
}

