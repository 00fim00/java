package com.Massivi;

public class Massivi {
    int[] array = new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {10, 3, 7};
    Candy candyFirst = new Candy();
    Candy candySecound = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecound, candyThird};

    public void foo() {
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

            System.out.println(box[0]);
            int[][] array = new int[2][3];
            int[][] array2 = {{2, 3}, {3, 4}};

            System.out.println(array2[1][0]);
        }

    }
}

