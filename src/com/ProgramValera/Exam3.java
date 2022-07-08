package com.ProgramValera;
import java.util.Scanner;

public class Exam3 extends Operators{
    public static void processing(){
        Exam3.daysOfWeek();
    }
    private static void daysOfWeek() {
        System.out.println("Input number of week: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 7 == 1) {
            System.out.println("Понидельник");
        } else if (i % 7 == 2) {
            System.out.println("Вторник");
        } else if (i % 7 == 3) {
            System.out.println("Среда");
        } else if (i % 7 == 4) {
            System.out.println("Четвер");
        } else if (i % 7 == 5) {
            System.out.println("Пятница");
        } else if (i % 7 == 6) {
            System.out.println("Суббота");
        } else if (i % 7 == 0) {
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("no day");
        }
    }
}
