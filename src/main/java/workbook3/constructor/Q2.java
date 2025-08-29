package main.java.workbook3.constructor;

import java.util.Scanner;

class Point {
    int x, y;
    Point() {                                   // 기본 생성자
        // TODO: 기본 생성자에서 x,y 초기화
        this.x = 0;                             // x를 0으로 초기화
        this.y = 0;                             // y를 0으로 초기화

    }
    Point(int x, int y) {                       // 매개변수 x, y를 갖는 생성자
        // TODO: 매개변수 생성자에서 x,y 초기화
        this.x = x;                             // 전달받은 매개변수 x를 필드 x에 저장
        this.y = y;                             // 전달받은 매개변수 y를 필드 x에 저장
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 생성
        int x = sc.nextInt();                   // 첫 번째 정수 읽어 x에 저장
        int y = sc.nextInt();                   // 두 번째 정수 읽어 y에 저장

        Point p1 = new Point();                 // Point() 객체 생성하여 p1에 저장 -> (0,0) 좌표 생성
        Point p2 = new Point(x, y);             // Point(x, y) 객체 생성하여 p2에 저장 -> 입력값 (x,y) 객체 생성

        System.out.println(p1.x + " " + p1.y);  // p1의 x, y를 공백으로 구분하여 출력 (개행) -> p1 좌표 출력
        System.out.println(p2.x + " " + p2.y);  // p2의 x, y를 공백으로 구분하여 출력 -> p2 좌표 출력
    }
}
