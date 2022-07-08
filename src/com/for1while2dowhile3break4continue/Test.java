package com.for1while2dowhile3break4continue;
class Test {

    public static void main (String [] args) {

        for (int i = 1; i <= 7; i++){
            System.out.println(i + ": я выполянюсь перед continue!");
            if (i > 2)
                continue;
            System.out.println("     "+ i + ": я выполянюсь всего два раза ;(");
        }
    }
}