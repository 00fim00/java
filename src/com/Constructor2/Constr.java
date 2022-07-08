package com.Constructor2;

import java.security.PublicKey;

public class Constr {
    public static void main(String[] args) {
    Human human1 = new Human();
    }
}

class Human {
    public Human(){
        System.out.println("Имя по умолчанию "+age);
        this.age = 0;
    }
    public Human(String name){
        System.out.println("Привет из 2 к-ра!");
        this.name = name;
    }
    public Human(String name,int age){
        System.out.println("Привет из 3 к-ра!");
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void  setAge(int age){
        this.age = age;
    }
}
