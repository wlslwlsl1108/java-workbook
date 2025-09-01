package main.java.workbook3.thissuper;

import java.util.Scanner;

class Person {                                              // Person 클래스
    String name;                                            // 인스턴스 필드 name, age 선언
    int age;

    Person(String name, int age) {                          // 생성자 정의
        // TODO: this 사용해 초기화
        this.name = name;                                   // 전달받은 name 값으로 this 사용해 초기화
        this.age = age;                                     // 전달받은 age 값으로 this 사용해 초기화
    }
    void printInfo() {                                      // printInfo() 메서드 정의
        // TODO: this를 사용하여 필드 출력
        System.out.println(this.name + " " + this.age);     // this 사용하여 Person 객체의 name/age 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // 입력받기
        String n = sc.next();                                // 이름 입력
        int a = sc.nextInt();                                // 나이 입력
        Person p = new Person(n, a);                         // Person 객체 생성하여 타입 Person인 p가 참조
        p.printInfo();                                       // p가 참조하는 printInfo()메서드 출력 => 이름/나이 출력
    }
}