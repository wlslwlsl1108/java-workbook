package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Person {                                                  // 부모 클래스
    String name;                                                // 인스턴스 변수 name
    Person(String name) {                                       // 부모 생성자 정의
        this.name = name;                                       // name 초기화 (전달받은 name 값으로)
    }
    void introduce() {                                          // 사람 소개 메서드
        System.out.println("Hello, I'm " + name + ".");         // 소개 출력
    }
}

class Student extends Person {                                  // 자식 클래스 -> 부모(Person) 클래스 상속
    Student(String name) {                                      // 자식 생성자 정의
        super(name); // super() 맛보기                           // 부모(Person) 생성자 호출 -> 자식이 전달받은 name 값으로 초기화
    }
    void introduce() {                                          // 학생 소개 메서드
        // TODO: 학생 소개 출력
        System.out.println("Hello, I'm " +name + " student.");  // 학생 소개 출력
    }
}

class Teacher extends Person {                                  // 자식 클래스 -> 부모(Person) 클래스 상속
    Teacher(String name) {                                      // 자식 생성자 정의
        super(name); // super() 맛보기                           // 부모(Person) 생성자 호출 -> 자식이 전달받은 name 값으로 초기화
    }
    void introduce() {                                          // 교사 소개 메서드
        // TODO: 교사 소개 출력
        System.out.println("Hello, I'm " + name + " teacher."); // 교사 소개 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력받기
        String type1 = sc.next();               // 첫 번째 타입 입력 (student / teacher)
        String name1 = sc.next();               // 첫 번째 이름 입력
        String type2 = sc.next();               // 두 번째 타입 입력 (student / teacher)
        String name2 = sc.next();               // 두 번째 이름 입력

        // type1이 "student" 이면 Student 객체 생성, 아니면 Teacher 객체 생성 -> p1이 참조
        Person p1 = type1.equals("student") ? new Student(name1) : new Teacher(name1);
        // type2가 "student" 이면 Student 객체 생성, 아니면 Teacher 객체 생성 -> p2가 참조
        Person p2 = type2.equals("student") ? new Student(name2) : new Teacher(name2);
        p1.introduce();                         // p1이 참조하는 introduce() 메서드 호출(실행)
        p2.introduce();                         // p2가 참조하는 introduce() 메서드 호출(실행)
    }
}