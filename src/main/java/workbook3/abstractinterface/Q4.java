package main.java.workbook3.abstractinterface;

import java.util.Scanner;

interface Movable {
    void move();
}

class Robot implements Movable {
    public void move() {
        // TODO: "Robot moves" 출력
        System.out.println("Robot moves");
    }
}

class Car implements Movable {
    public void move() {
        // TODO: "Car moves" 출력
        System.out.println("Car moves");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movable[] objs = new Movable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            objs[i] = t.equals("robot") ? new Robot() : new Car();
        }
        for (Movable m : objs) {
            m.move();
        }
    }
}