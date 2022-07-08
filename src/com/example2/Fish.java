package com.example2;
public class Fish extends Pet {
    int  currentDepth=0;
    public int dive(int howDeep){
            currentDepth = currentDepth + howDeep;
            System.out.println("Ньіряю на глубину " + howDeep + " футов");
            System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
            return currentDepth;
    }
    public String say(String something){
        String petResponse = "Ты чё не знаешь, что рыбы не разговаривают?";
        System.out.println(petResponse);
        return petResponse;
    }

}







