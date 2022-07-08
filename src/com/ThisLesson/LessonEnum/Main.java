package com.ThisLesson.LessonEnum;

public class Main {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;

//        switch (mc){
//            case CLASSIC:
//                System.out.println("Classic");
//                break;
//            case POP:
//                System.out.println("POP");
//                break;
//            case ROCK:
//                System.out.println("Rock");
//                break;
//        }
        System.out.println(mc.getI());
        System.out.println(mc.getName());
        }
    }


