package com.enums;

public class EnumsExamples {
    enum CoffeSize {SMALL(100), MEDDIUM(200), BIG(300) {
        String getCoffeClass(){
            return "B";
        }
    };
        String coffeClass = "A";
        int milliliters;
        CoffeSize(int milliliters){
            this.milliliters = milliliters;
        }
        int getMilliliters(){
            return milliliters;
        }
        String getCoffeClass(){
            return coffeClass;
        }
    }

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMilliliters());
        System.out.println(coffeSize.getCoffeClass());
    }
}