package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Employee {                                // 클래스 정의
    public String name;                         // 인스턴스 필드 선언 -> public (직접 접근 가능)
    private int salary;                         // 인스턴스 필드 선언 -> private (직접 접근 불가)

    Employee(String name, int salary) {         // 생성자 정의
        this.name = name;                       // 전달받은 값으로 초기화
        this.salary = salary;
    }

    public int getSalary() {                    // get 메서드 (getter)
        return salary;                          // salary 반환
    }

    public void setSalary(int salary) {         // set 메서드 (setter)
        // TODO: salary 설정
        this.salary = salary;                   // 전달받은 값으로 salary 값 설정
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                         // 입력 받기
        String n1 = sc.next();                                       // 첫 번째 직원 이름
        int s1 = sc.nextInt();                                       // 첫 번째 직원 연봉
        String n2 = sc.next();                                       // 두 번째 직원 이름
        int s2 = sc.nextInt();                                       // 두 번째 직원 연봉
        int raise = sc.nextInt();                                    // 인상 연봉 (추가 금액)
        Employee e1 = new Employee(n1, s1);                          // Employee 객체 생성하여 e1이 참조
        Employee e2 = new Employee(n2, s2);                          // Employee 객체 생성하여 e2가 참조
        e1.setSalary(e1.getSalary() + raise);
        // 1. 현재 연봉 반환 (getSalary 호출)
        // 2. 인산 연봉 합산 (반환값 + raise)
        // 3. set 메서드로 다시 저장 (setSalary 호출)
        System.out.println(e1.getSalary() + " " + e2.getSalary());   // 첫 번째 직원 연봉 , 두 번째 직원 연봉 출력
    }
}
