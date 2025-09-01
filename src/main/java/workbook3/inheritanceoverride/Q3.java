package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

class Vehicle {                                     // 부모 클래스
    void move() {                                   // move() 메서드 정의
        System.out.println("Vehicle is moving");    // "Vehicle is moving" 출력
    }
}

class Car extends Vehicle {                         // 자식 클래스 Car -> 부모(Vehicle) 상속
    void move() {                                   // 부모의 move() 메서드 재정의   => 오버라이딩
        // TODO: "Car is moving" 출력
        System.out.println("Car is moving");        // "Car is moving" 출력
    }
}

class Bike extends Vehicle {                        // 자식 클래스 Bike -> 부모(Vehicle) 상속
    void move() {                                   // 부모의 move() 메서드 재정의  => 오버라이딩
        // TODO: "Bike is moving" 출력
        System.out.println("Bike is moving");       // "Bike is moving" 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Scanner 생성 (입력 받기)
        Vehicle[] vehicles = new Vehicle[3];        // 길이 3인 배열 Vehicle 생성하여 vehicles(부모 타입)가 참조

        for (int i = 0; i < 3; i++) {               // 3번 반복
            String type = sc.next();                // type 입력받기
            // 입력값이 car가 맞으면 new Car() , 아니면 new Bike() 객체 생성하여 배열에 저장
            vehicles[i] = type.equals("car") ? new Car() : new Bike();
        }
        for (Vehicle v : vehicles) {                // 다형성! -> Vehicle 타입 하나로 Car.move() , Bike.move() 둘 다 가능
            v.move();                               // 배열에 저장된 참조를 이용해여 각 Car, Bike 클래스의 move()메서드 호출
        }
    }
}