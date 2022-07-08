package com.prog.academy.prog;

import java.util.HashMap;

public class academy {
    public static void main(String[] args) {
//        String s = "Hello world";
//        String [] words = s.split(" ");
//
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//
//        for (String w : words)
//            System.out.println(w);
//

        HashMap map = new HashMap();
        map.put("Hello" , "Привет");
        map.put("world" , "мир");
        System.out.println(map.get("Hello"));
        System.out.println(map.get("world"));

    }
}
