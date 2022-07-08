package com.ProgramValera;

public class Exam10 extends Arrays {
    public static void processing() {
        Exam10.Array();
    }
    private static void Array(){
        String str = "HelloLehaZub";
        char[] result = str.toCharArray();

        System.out.println("Char array: ");
        for (int i = 0; i < result.length; i++)
            if (i<=5)
            System.out.println("Element [" + i + "]: " + result[i]);
    }
}
