package com.Static;

public class Main {
    public static void main(String[] args) {
        LessonStatic s = new LessonStatic();
        LessonStatic s1 = new LessonStatic();
        LessonStatic s2 = new LessonStatic();

        LessonStatic.variable = 5;
        LessonStatic.foo();
    }
}
