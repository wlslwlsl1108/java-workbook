package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Shape {                          // Shape 클래스  -> 부모 클래스 (추상 클래스)
    abstract void draw();                       // draw() 메서드 -> 추상 메서드 (자식 클래스에서 반드시 구현 필요)
}

class Circle extends Shape {                    // Circle 클래스  -> 자식 클래스
    void draw() {                               // draw() 메서드 재정의(추상 메서드 구현)
        // TODO: "Draw Circle" 출력
        System.out.println("Draw Circle");      // Draw Circle 출력
    }
}

class Rectangle extends Shape {                 // Rectangle 클래스 -> 자식 클래스
    void draw() {                               // draw() 메서드 재정의(추상 메서드 구현)
        // TODO: "Draw Rectangle" 출력
        System.out.println("Draw Rectangle");   // Draw Rectangle 출력
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 생성
        Shape[] arr = new Shape[3];             // 길이 3인 Shape 배열 객체 생성하여, arr이 참조
        for (int i = 0; i < 3; i++) {           // 3번 반복 입력
            String type = sc.next();            // 입력받은 문자열 type에 저장
            if (type.equals("circle")) {        // 만약 circle 입력받았다면
                arr[i] = new Circle();          // Circle() 객체 생성하여 arr[i]에 저장
            } else {                            // 그 밖에는
                arr[i] = new Rectangle();       // Rectangle() 객체 생성하여 arr[i]에 저장
            }
        }
        for (Shape s : arr) {                   // arr의 배열 각 요소를 s에 담아 반복
            s.draw();                           // s가 참조하는 draw()메서드 호출 -> "다형성"
        }
    }
}

/*
     [ 추상 클래스 (abstract class) ]
        - abstract 키워드로 선언된 클래스
        - 스스로 객체 생성 불가능  ->  new 못함

     [ 추상 메서드 (abstract method) ]
        - abstract 키워드 붙음
        - 선언만 있고, 구현 x

      => 추상 클래스 상속받은 자식 클래스는 "모두" 추상 메서드 구현(override) 필요!
           ( 구현 안하려면, 이 자식 클래스도 추상 클래스가 되어야 함 )
 */

/*
     [ 다형성 (Polymorphism) ]
        - 부모 타입(Shape) 하나로 여러 자식 객체(Circle, Rectangle) 다룰 수 있음
        - ex. Shape s1 = new Circle();
              Shape s2 = new Rectangle();

     [ 오버라이딩 (Overriding) ]
        - 부모 클래스의 메서드를 자식 클래스에서 재정의
        - ex. 위처럼 draw()메서드를 부모로부터 물려받았지만, 재정의 함
 */

/*
     즉, draw() 메서드를 Circle, Rectangle 클래스에서 재정의 => " 오버라이딩 "
        오버라이딩 덕에 Shape 타입 하나로 여러 자식 객체 다룸 => " 다형성 "
 */