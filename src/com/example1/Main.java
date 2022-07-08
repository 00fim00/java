package com.example1;
import java.util.Scanner; // импорт сканера

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите 2 число: ");
        int num2 = scan.nextInt();

        int res = num1 + num2;
        System.out.println("Результат: " + res);
    }
}