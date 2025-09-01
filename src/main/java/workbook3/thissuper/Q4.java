package main.java.workbook3.thissuper;

import java.util.Scanner;

class Employee {                                      // 부모 클래스
    String name, dept;                                // 부모 인스턴스 필드 선언 (문자열)
    int salary;                                       // 부모 인스턴스 필드 선언 (정수)

    Employee(String name, String dept, int salary) {  // 부모 생성자 정의
        // TODO: 필드 초기화
        this.name = name;                             // 전달받은 값으로 필드 초기화
        this.dept = dept;
        this.salary = salary;
    }

    void printInfo() {                                                                    // printInfo() 메서드 - 부모
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary);    // name, dept, salary 출력
    }
}

class Manager extends Employee /* TODO: Employee 상속 */ {           // 자식 클래스 > Employee 상속
    String team;                                                    // 자식 인스턴스 필드 선언

    Manager(String name, String dept, int salary, String team) {    // 자식 생성자 정의
        // TODO: super() 호출 및 team 초기화
        super(name, dept, salary);                                  // name, dept, salary는 부모 생성자 호출하여, 자식이 전달받은 값으로 초기화
        this.team = team;                                           // 전달받은 team 값으로 team 초기화
    }

    void printInfo() {                                              // 자식 printInfo() 메서드 -> 오버라이딩
        // TODO: super.printInfo() 호출 후 팀 정보 출력
        super.printInfo();                                          // 부모의 printInfo() 메서드 호출 -> 출력
        System.out.println(", Team: " + team);                      // 팀 정보 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        // 입력 받기
        String n = sc.next();                                       // 이름 입력
        String d = sc.next();                                       // 부서 입력
        int s = sc.nextInt();                                       // 연봉 입력
        String t = sc.next();                                       // 팀 입력
        Manager m = new Manager(n, d, s, t);                        // Manager 객체 생성하여 m이 참조 -> 부모 생성자 호출하여 자식 생성자 초기화 됨
        m.printInfo();                                              // m이 참조하는 printInfo() 호출
    }                                                               // 1. 오버라이딩 되어있어서 자식 printInfo() 메서드 호출
}                                                                   // 2. 자식 printInfo() 메서드에 super가 있으므로 부모 printInfo() 호출
                                                                    // 3. 부모 printInfo()에서 name/dept/salary 출력 후, 자식 printInfo()에서 team 출력

/*
    [ 만약 자식 생성자 정의 시 super를 작성하지 않는다면? ]
       - 부모의 기본 생성자를 자동으로 호출
          -> 그러나 현재 부모 클래스는 기본 생성자 x
             => 컴파일 에러 발생

    [ 만약 자식 printInfo() 메서드 정의 시 super를 작성하지 않는다면? ]
       - 부모 메서드 호출하지 않으므로, 자식 클래스에서 작성한 Team 정보만 호출(출력) 됨

    @@ [자식 생성자] 에서 super는 필수! -> 부모의 기본 생성자가 없는 경우
           ( 부모의 기본 생성자가 있는 경우는 생략 가능
               -> 부모 필드를 원하는 값으로 초기화 및 활용하려면 해당 생성자 호출 필요 )

    @@ [자식 메서드] 에서 super는 선택!
 */