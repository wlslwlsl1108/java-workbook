package main.java.workbook3.abstractinterface;

import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        // TODO: "Meow" 출력
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    void sound() {
        // TODO: "Woof" 출력
        System.out.println("Woof");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        Animal animal1 = a1.equals("cat") ? new Cat() : new Dog();
        Animal animal2 = a2.equals("cat") ? new Cat() : new Dog();
        animal1.sound();
        animal2.sound();
    }
}