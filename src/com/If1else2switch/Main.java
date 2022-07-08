package com.If1else2switch;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i==1){
            System.out.println("1");
        } else if (i==2) {
            System.out.println("2");
        }
        else if (i==3){
            System.out.println("3");
        }
        else {
            System.out.println("не 1 или 2 или 3");
        }
    }
}
