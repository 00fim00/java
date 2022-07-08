package com.ThisLesson.LessonEnum;

public enum Music {
    CLASSIC(1,"classic"),ROCK(2,"rock"),POP(3,"pop");

    private int i;
    private String name;

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
