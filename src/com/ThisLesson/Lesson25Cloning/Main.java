package com.ThisLesson.Lesson25Cloning;

public class Main {
    public static void main(String[] args) {
        DollySheep dollySheep = new DollySheep();
        DollySheep dollySheep2 = foo(dollySheep);

        dollySheep.setName("Dolly");
        dollySheep.setName("Sheep");

        System.out.println(dollySheep.getName() );
        System.out.println(dollySheep2.getName() );
    }

    public static DollySheep foo(DollySheep dollySheep2) {

        DollySheep sheep = null;
        try {
             sheep = (DollySheep)dollySheep2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}