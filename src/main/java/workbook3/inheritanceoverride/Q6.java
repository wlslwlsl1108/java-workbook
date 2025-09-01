package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Employee {                                // 부모 클래스 -> 추상 클래스
    // TODO: 급여 반환
    abstract double getPay();                            // 추상 메서드 -> 자식 클래스에서 오버라이딩(구현) 필수
}

class FullTimeEmployee extends Employee {                // 정규직 급여 클래스 -> 자식 클래스
    double monthlySalary;                                // 월급 변수 선언

    FullTimeEmployee(double monthlySalary) {             // 생성자 정의
        this.monthlySalary = monthlySalary;              // 월급을 전달받은 값(monthlySalary)으로 초기화
    }
    double getPay() {                                    // 정규직 급여 반환 메서드 -> 오버라이딩
        // TODO: 정규직 급여 계산
        return monthlySalary;                            // 정규직 급여 반환
    }
}

class PartTimeEmployee extends Employee {                // 시간제 급여 클래스 -> 자식 클래스
    double hourlyRate, hours;                            // 시급, 근무시간 변수 선언

    PartTimeEmployee(double hourlyRate, double hours) {  // 생성자 정의
        this.hourlyRate = hourlyRate;                    // 시급을 전달받은 값(hourlyRate)으로 초기화
        this.hours = hours;                              // 근무시간을 전달받은 값(hours)으로 초기화
    }
    double getPay() {                                    // 시간제 급여 반환 메서드 -> 오버라이딩
        // TODO: 시간제 급여 계산
        return hourlyRate * hours;                       // 시간제 급여 반환
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);             // 입력 받기

        // 첫 번째 직원
        String type1 = sc.next();                        // "full"(정규직)/"part"(시간제) 선택하여 입력
        Employee e1;                                     // 첫번째 직원 e1
        if (type1.equals("full")) {                      // 만약 정규직(full)이면
            double salary = sc.nextDouble();             // 월급을 입력받기 -> salary가 참조
            e1 = new FullTimeEmployee(salary);           // FullTimeEmployee 객체 생성하여 e1이 참조

        } else { // type1 == "part"                      // 시간제(part)이면
            double rate = sc.nextDouble();               // 시급 입력받기 -> rete가 참조
            double h = sc.nextDouble();                  // 시간 입력받기 -> h가 참조
            e1 = new PartTimeEmployee(rate, h);          // PartTimeEmployee 객체 생성하여 e1이 참조
        }

        // 두 번째 직원
        String type2 = sc.next();                        // "full"(정규직)/"part"(시간제) 선택하여 입력
        Employee e2;                                     // 두번째 직원 e2
        if (type2.equals("full")) {                      // 만약 정규직(full)이면
            double salary = sc.nextDouble();             // 월급 입력받기 -> salary가 참조
            e2 = new FullTimeEmployee(salary);           // FullTimeEmployee 객체 생성하여 e2가 참조

        } else {                                         // 시간제(part)이면
            double rate = sc.nextDouble();               // 시급 입력받기 -> rete가 참조
            double h = sc.nextDouble();                  // 시간 입력받기 -> h가 참조
            e2 = new PartTimeEmployee(rate, h);          // PartTimeEmployee 객체 생성하여 e2가 참조;
        }

        System.out.println(e1.getPay());                 // e1이 참조하는 getPay() 메서드 호출 -> 첫 번째 직원 월급 출력
        System.out.println(e2.getPay());                 // e2가 참조하는 getPay() 메서드 호출 -> 두 번째 직원 월급 출력
    }
}

/*
    [ 추상 클래스 ]
       - 조건에서 `Employee` 인스턴스화 할 수 없는 이유
           => 추상 클래스 이기 때문

    [ 추상 메서드 ]
       - `getPay()` 는 추상 메서드이므로,
          반드시 자식 클래스에서 오버라이딩!
 */