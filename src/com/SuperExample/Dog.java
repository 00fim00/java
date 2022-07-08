package com.SuperExample;

public class Dog {
    public void voice(){
        System.out.println("Hello World from Dog class!");
    }
    public static void main(String[] args) {
        Dobermann d = new Dobermann();
        d.voice();
    }

}
