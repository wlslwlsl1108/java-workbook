package main.java.workbook3.constructor;

import java.util.Scanner;

class Employee {     // Employee 클래스
    String name;     // 인스턴스 변수 (필드) -> name, dept, salary
    String dept;
    int salary;

    Employee() {                                      // 기본생성자  (salary는 초기화 안해줘도 기본값 o)
        this.name = "Unknown";                        // name 초기화 (기본값 : Unknown)
        this.dept = "Unknown";                        // dept 초기화 (기본값 : Unknown)
    }
    Employee(String name, String dept, int salary) {  // 매개변수 name, dept, salary 갖는 생성자
        this.name = name;                             // 전달받은 name 값으로 name 초기화
        this.dept = dept;                             // 전달받은 dept 값으로 dept 초기화
        this.salary = salary;                         // 전달받은 salary 값으로 salary 초기화
    }
    Employee(String name) {                           // 매개변수 name 갖는 생성자
        this.name = name;                             // 전달받은 name 값으로 name 초기화
        this.dept = "Unknown";                        // dept 초기화 (기본값 : Unknown)
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                             // Scanner 생성
        String name1 = sc.next();                                        // 첫 번째 직원 name 입력
        String dept1 = sc.next();                                        // 첫 번째 직원 dept 입력
        int sal1 = sc.nextInt();                                         // 첫 번째 직원 salary 입력
        String name2 = sc.next();                                        // 두 번째 직원 name 입력
        Employee e1 = new Employee();                                    // 기본생성자 호출
        Employee e2 = new Employee(name1, dept1, sal1);                  // 매개변수 name, dept, salary 갖는 생성자 호출
        Employee e3 = new Employee(name2);                               // 매개변수 name 갖는 생성자 호출
        System.out.println(e1.name + " " + e1.dept + " " + e1.salary);   // e1의 name/dept/salary 출력 (공백으로 구분)
        System.out.println(e2.name + " " + e2.dept + " " + e2.salary);   // e2의 name/dept/salary 출력 (공백으로 구분)
        System.out.println(e3.name + " " + e3.dept + " " + e3.salary);   // e3의 name/dept/salary 출력 (공백으로 구분)
    }
}

/*
      [ 인스턴스 변수 (필드) ]
          - 클래스 블록 안에 선언
          - 객체 생성 시, 객체의 속성(상태)을 정장하는 공간
          - this 키워드 붙이면 현재 객체의 인스턴스 변수 가리킴
          - 객체마다 독립적으로 존재

      [ 매개변수 ]
          - 생성자 or 메서드 괄호 안에 선언
          - 호출 시 전달받은 값을 임시로 저장하는 변수
          - 메서드나 생성자 실행 끝나면 사라짐 -> 지역 변수 성격

     ex. this.name = name
          => this.name(인스턴스 변수(필드) name) 에 전달받은 name(매개변수 name)을 저장한다.
 */