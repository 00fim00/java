package com.prog.academy.prog;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap dict = new HashMap();
        String words = "i=я;love=люблю;java=джава";

        String [] pairs = words.split(";");
        for (String pair : pairs) {
            String[] w = pair.split("=");

            String en = w[0];
            String ru = w[1];

            dict.put(en,ru);
        }
        System.out.println(dict);
        System.out.println("Введите строку для перевода: ");
        String sentence = scanner.nextLine();

        String[] enWords = sentence.split(" ");
        String result = "";

        for (String w: enWords) {
            result += dict.get(w);
            result += " ";
        }
        System.out.println(result);

    }
}
