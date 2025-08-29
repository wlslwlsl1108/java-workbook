package main.java.workbook3.varinit;

import java.util.Scanner;

class InitPerson {                              // InitPerson 클래스
    static int counter = 0;                     // 클래스 정적 변수 counter 선언 및 초기화 (생성된 객체 수 카운트, 초기값 0)
    static {                                    // static 초기화 블록 (클래스 로딩 시 1 회만 실행)
        // TODO: "class loaded" 출력
        System.out.println("class loaded");     // "class loaded" 출력
    }
    String name;                                // 인스턴스 변수(name) 선언
    int id;                                     // 인스턴스 변수(id) 선언
    {                                           // 인스턴스 초기화 블록
        // TODO: id 부여
        id = ++counter;                         // counter을 1 증가하여 id에 저장
    }
    InitPerson(String name) {                   // InitPerson 생성자 정의
        // TODO: name 초기화
        this.name = name;                       // 입력받는 name 값으로 초기화
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           // Scanner 생성
        String n1 = sc.next();                         // 첫 번째 문자열 입력
        String n2 = sc.next();                         // 두 번째 문자열 입력
        String n3 = sc.next();                         // 세 번째 문자열 입력
        InitPerson p1 = new InitPerson(n1);            // n1을 전달받아 name이 n1인 InitPerson 객체 생성하고, p1이 참조
        InitPerson p2 = new InitPerson(n2);            // n2을 전달받아 name이 n2인 InitPerson 객체 생성하고, p2가 참조
        InitPerson p3 = new InitPerson(n3);            // n3을 전달받아 name이 n3인 InitPerson 객체 생성하고, p3이 참조
        System.out.println(p1.name + " " + p1.id);     // p1 이름과 id 출력
        System.out.println(p2.name + " " + p2.id);     // p2 이름과 id 출력
        System.out.println(p3.name + " " + p3.id);     // p3 이름과 id 출력
    }
}
/*
      [생성자 호출(new InitPerson() -> 객체 생성시)]
        = name 초기화 + counter 1증가
 */