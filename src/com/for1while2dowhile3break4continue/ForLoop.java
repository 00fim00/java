package com.for1while2dowhile3break4continue;

public class ForLoop {
    int [] array = {1,2,3};
    public void foo() {
        for (int element : array){
            System.out.println(element);
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
