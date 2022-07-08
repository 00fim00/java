package com.ProgramValera;

public class Exam9 extends Loops {
    public static void processing() {
        Exam9.Loop();
    }
    private static void Loop(){
        int i = 1;
        do {
            if (i%5==0){
                System.out.println(i);
            }
            i++;
        }while (i<=100);
    }
}
