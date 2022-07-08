package com.KlassAndObject;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roma");
        person1.setAge(20);
//        person1.speak();
//        person1.sayHello();
        System.out.println("Вьіводим значение в main методе: " + person1.getName());
        System.out.println("Вьіводим значение в main методе: " + person1.getAge());
        person1.getName();
        person1.getAge();
        Person person2 = new Person();
        String s2 = "Vova";
        person2.setName(s2);
        person2.setAge(25);
//        person2.speak();
//        person2.sayHello();
//        int years1 = person1.calc();
//        int years2 = person2.calc();
//        System.out.println(years1);
//        System.out.println(years2);
    }
}
class Person{
    private String name;
    private int age;

    void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Тьі ввел пустое имя");
        } else {
        name = userName;}
    }
    public String getName(){
        return name;
    }
    void setAge(int userAge){
        if(userAge<0){
            System.out.println("Тьі ввел неправильное число");
        }else {
        age = userAge;}
    }
    public int getAge(){
        return age;
    }
    int calc(){
        int years = 65-age;
        return years;
    }

//    void speak(){
//        System.out.println("my name is " + name + "Iam " + age);
//    }

    void sayHello(){
        System.out.println("Hello");
    }
}