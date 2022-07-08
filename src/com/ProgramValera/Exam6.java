package com.ProgramValera;

public class Exam6 extends Arrays {
    public static void processing(){
        Exam6.Array1();
    }
    private static void Array1() {
        String[][] array1 = new String[3][6];
        String[][] array2 = {{"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"}};
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
