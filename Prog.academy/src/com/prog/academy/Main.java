package com.prog.academy;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is exchange rate today?");
        double rate = sc.nextDouble();
        System.out.println("how many?");
        double count = sc.nextDouble();

        double res = rate * count;
        System.out.println("Result: " + res);


    }
}
