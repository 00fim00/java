package com.ThisLesson.Lesson21;

public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, int wings) {
        this.name = name;
//        this.wings = wings;
    }

    public void walk(){
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
