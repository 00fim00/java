package com.ProgramValera;

public class Exam11 extends Arrays {
    public static void processing() {
        Exam11.Array();
    }
    private static void Array() {
        char[][] syms = new char[4][2];
        {
            syms[0][0] = 'q';
            syms[0][1] = 'w';
            syms[1][0] = 'e';
            syms[1][1] = 'r';
            syms[2][0] = 't';
            syms[2][1] = 'y';
            syms[3][0] = 'u';
            syms[3][1] = 'i';
        }
        {
            for (int i = 0; i < syms.length; i++) {
                System.out.println(syms[i]);
            }
        }
    }
}
