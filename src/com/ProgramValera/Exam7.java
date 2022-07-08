package com.ProgramValera;
import java.util.Scanner;

public class Exam7 extends Operators {
    public static void processing(){
        Exam7.definitionWeekDay();
    }

    private static void definitionWeekDay() {
        System.out.println("Input number of week: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Понидельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }
}
