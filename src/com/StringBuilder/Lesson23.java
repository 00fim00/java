package com.StringBuilder;

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" Friend");
        System.out.println(sb.toString());
    }
}
