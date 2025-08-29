package main.java.workbook3.constructor;

import java.util.Scanner;

class Student {
    String name;

    Student() {                   // 기본 생성자
        // TODO: name 초기화
        this.name = "Unknown";    // name = "Unknown" 으로 초기화
    }
    Student(String name) {        // 이름 매개변수로 받는 생성자
        // TODO: name 초기화
        this.name = name;         // 매개변수 name을 필드 name에 저장
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner 생성
        String name = sc.next();               // 문자열을 읽어 name 에 저장
        Student s1 = new Student();            // Student() 객체 생성하여 s1에 저장
        Student s2 = new Student(name);        // Student(name) 객체 생성하여 s2에 저장
        // TODO: s1.name과 s2.name 출력
        System.out.println(s1.name);           // s1의 name 출력
        System.out.println(s2.name);           // s2의 name 출력
    }
}
