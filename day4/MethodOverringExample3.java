package com.celcom.day4;

class Animal1 {
    int a = 10;

    void move1() {
        System.out.println("Can not define");
    }
}

class Cat1 extends Animal1 {
    int a = 20;

    void move1() {
        System.out.println("Cat will move by Walk");
    }
}

public class MethodOverringExample3 {
    public static void main(String[] args) {
        Animal1 animal = new Cat1();
        animal.move1();  
        System.out.println(animal.a);
    }
}
