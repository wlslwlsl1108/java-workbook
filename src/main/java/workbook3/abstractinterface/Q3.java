package main.java.workbook3.abstractinterface;

import java.util.Scanner;

abstract class Shape {
    abstract double perimeter();
}

class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return 2*(w+h);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return a+b+c;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        Shape s;
        if (type1.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            s = new Rectangle(w, h);

        } else {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            s = new Triangle(a, b, c);
        }
        System.out.println((int)s.perimeter()); // int 형태로 출력
    }
}
