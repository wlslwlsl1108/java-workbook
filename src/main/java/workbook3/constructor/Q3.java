package main.java.workbook3.constructor;

import java.util.Scanner;

class Car {
    String model;
    int price;
    Car() {                          // 기본 생성자
        this.model = "Unknown";      // model 기본값 = Unknown (price는 초기화 안해주면 기본값 0)
    }
    Car(String model, int price) {   // 모델명, 가격을 매개변수로 받는 생성자
        this.model = model;          // 모델명 초기화
        this.price = price;          // 가격 초기화
    }
    Car(int price) {                 // 가격을 매개변수로 받는 생성자
        this.model = "Unknown";      // model 기본값 = Unknown (model은 초기화 안해주면 null 값 출력됨)
        this.price = price;          // 가격 초기화
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              // Scanner 생성
        String m = sc.next();                             // 문자열 1개 입력
        int p1 = sc.nextInt();                            // 정수 1개 입력
        int p2 = sc.nextInt();                            // 정수 1개 입력
        Car c1 = new Car();                               // 기본 생성자 호출 -> Car() 객체 생성하여 c1에 참조를 저장
        Car c2 = new Car(m, p1);                          // model, price 받는 생성자 호출 -> Car(m, p1) 객체 생성하여 c2에 참조를 저장
        Car c3 = new Car(p2);                             // price만 받는 생성자 호출 -> Car(p2) 객체 생성하여 c3에 참조를 저장
        System.out.println(c1.model + " " + c1.price);    // c1 모델명/가격 출력
        System.out.println(c2.model + " " + c2.price);    // c2 모델명/가격 출력
        System.out.println(c3.model + " " + c3.price);    // c3 모델명/가격 출력
    }
}

/*  [ this.model = model ]
       - 오른쪽 model = 생성자의 매개변수
       - 외부에서 받은 값을 필드에 초기화

    [ this.model = "Unknown" ]
       - 매개변수로 값 못받을 경우 기본값 설정
       - 아무값도 안들어오면 "Unknown" 기본값으로 설정됨
 */