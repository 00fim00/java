package com.If1else2switch;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();
        int res;
        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На 0 не делится");
                else if (num1 == 0)
                    System.out.println("0 нельзя делить");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default :
                System.out.println("Вьі чтото не то ввели");
        }
    }
}
