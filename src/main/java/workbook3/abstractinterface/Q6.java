package main.java.workbook3.abstractinterface;

import java.util.Scanner;

interface Drawable {
    void draw();
}

interface Rotatable {
    void rotate();
}

class Square implements Drawable, Rotatable {
    public void draw() {
        // TODO: "Square drawn" 출력
        System.out.println("Square drawn");
    }

    public void rotate() {
        // TODO: "Square rotated" 출력
        System.out.println("Square rotated");
    }
}

class Circle implements Drawable {
    public void draw() {
        // TODO: "Circle drawn" 출력
        System.out.println("Circle drawn");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();
        Drawable d1 = t1.equals("square") ? new Square() : new Circle();
        Drawable d2 = t2.equals("square") ? new Square() : new Circle();
        d1.draw();
        if (d1 instanceof Rotatable) { // d1이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d1 객체를 활용하여 rotate() 메서드를 호출한다.
            ((Rotatable) d1).rotate();
            // d1 타입 : Drawable  -> rotate() 메서드 바로 호출 불가
            // " (Rotatable) d1 " -> Rotatable 인터페이스로 캐스팅 필요!
            // 타입 변환 후 rotate() 메서드 호출
        }
        d2.draw();
        if (d2 instanceof Rotatable) { // d2이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d2 객체를 활용하여 rotate() 메서드를 호출한다.
            ((Rotatable) d2).rotate();
        }
    }
}
