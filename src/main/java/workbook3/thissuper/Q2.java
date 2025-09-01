package main.java.workbook3.thissuper;

import java.util.Scanner;

class Box {
    int width, height, depth;
    Box() {                                // 기본 생성자 정의
        // TODO: 매개변수 생성자 호출하여 1,1,1로 초기화
        this(1,1,1);              // 매개변수 생성자 호출하여 1,1,1로 초기화
    }
    Box(int w, int h, int d) {             // 매개변수 w, h, d 갖는 생성자 정의
        // TODO: 멤버 초기화
        this.width = w;                    // 입력받은 w 값으로 width 초기화
        this.height = h;                   // 입력받은 h 값으로 height 초기화
        this.depth = d;                    // 입력받은 d 값으로 depth 초기화
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                               // 입력받기
        int w = sc.nextInt();                                              // w 입력
        int h = sc.nextInt();                                              // h 입력
        int d = sc.nextInt();                                              // d 입력
        Box b1 = new Box();                                                // Box() 객체 생성하여 b1이 참조 -> 기본 생성자 호출
        Box b2 = new Box(w, h, d);                                         // Box(w, h, d) 객체 생성하여 b2가 참조 -> 매개변수 생성자 호출
        System.out.println(b1.width + " " + b1.height + " " + b1.depth);   // b1 객체의 width / height / depth 출력 (기본값 1,1,1)
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);   // b2 객체의 width / height / depth 출력 (입력받은 w,h,d)
    }
}
/*
    [ this(...) ] -> 주로 기본 생성자에서 사용
       - 같은 클래스 안에 있는 "다른 생성자 호출"
       - 위치) 생성자 안에서만 사용가능 -> 반드시 첫 줄에 위치!
       - 목적) 중복 코드 제거

    [ this.width = w ]
       - 현재 객체의 멤버 변수(width)를 매개변수(w)로 "초기화"
       - 위치) 생성자, 메서드 어디서든 사용 가능
       - 목적) 멤버 변수와 지역 변수(매개 변수) 구분

 */