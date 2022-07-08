package com.ProgramValera;
import java.util.Scanner;
public class Exam1 extends Operators {
    public static void processing() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        String result = parseNumber(scanner.nextInt());
        System.out.println(result);
    }
    private static String parseNumber(Integer number){
        String result;

        if(number == null){
            return "incorrect number";
        }

        if (number % 2 == 1) {
            result = "Countable";
        }
        else {
            result = "Uncountable";
        }
        return result;
    }
}

