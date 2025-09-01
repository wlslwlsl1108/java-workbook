package main.java.workbook3.thissuper;

import java.util.Scanner;

class Vehicle {                                        // 부모 클래스
    String model;                                      // 인스턴스 필드 선언
    int year;

    Vehicle(String model, int year) {                  // 부모 생성자 정의
        this.model = model;                            // 전달받은 값으로 필드 초기화
        this.year = year;
    }

    public String toString() {                         // 부모 toString 메서드 정의
        return "Model: " + model + ", Year: " + year;  // 모델, 연식 값 반환
    }
}
/* TODO: Vehicle 클래스 상속 */
class Car extends Vehicle {                            // 자식 클래스 -> Vehicle 상속
    String fuel;                                       // 인스턴스 필드 선언

    Car(String model, int year, String fuel) {         // 자식 생성자 정의
        // TODO: super() 호출 및 fuel 초기화
        super(model, year);                            // model, year 은 부모 생성자 호출하여 자식이 전달받은 값으로 초기화
        this.fuel = fuel;                              // 전달받은 값으로 fuel 초기화
    }
    public String toString() {                         // 자식 메서드 -> 오버라이딩
        // TODO: super 키워드 활용해서 Model, Year 정보와 함께 Fuel: " + fuel 출력
        return super.toString() + ", Fuel: " + fuel;   // 부모 메서드 호출(model, year)하여 자식메서드의 fuel과 함께 반환
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           // 입력받기
        String model = sc.next();                      // 모델 입력
        int year = sc.nextInt();                       // 연식 입력
        String fuel = sc.next();                       // 연료 입력
        Car car = new Car(model, year, fuel);
        // 1. Car 객체 생성하여 car가 참조
        // 2. 부모 생성자 호출하여 model/year 초기화 (super)
        // 3. fuel 초기화 (this)
        System.out.println(car.toString());
        // 1. car가 참조하는 toString() 메서드 호출
        // 2. toString()은 오버라이딩 되어있으므로 자식 메서드 호출
        // 3. super.toString() 즉, 부모 메서드 실행하여 Model / Year 반환
        // 4. 자식 메서드의 Fuel 정보와 함께 반환(출력)
    }
}
