package main.java.workbook3.thissuper;

import java.util.Scanner;

abstract class Building {                               // 부모 클래스 -> 추상 클래스
    int floors;                                         // 인스턴스 필드 선언

    Building(int floors) {                              // 부모 생성자 정의
        this.floors = floors;                           // 전달받은 floors 값으로 초기화
    }

    abstract void showInfo();                           // 부모 추상 메서드 -> 자식 클래스에서 구현
}
/* TODO: Building 상속 */
class House extends Building {                          // 자식 클래스 (House)
    House(int floors) {                                 // 자식 생성자 정의
        // TODO: super() 호출
        super(floors);                                  // 부모 생성자 호출하여 자식이 전달받은 값으로 초기화
    }

    void showInfo() {                                   // 자식 메서드 정의 -> 오버라이딩
        // TODO: "층수, 주거" 출력
        System.out.println(super.floors + " 주거");      // 층수(부모 클래스의 floors 필드) + " 주거" 출력
    }
}
/* TODO: Building 상속 */
class Office extends Building {                         // 자식 클래스 (Office)
    Office(int floors) {                                // 자식 생성자 정의
        // TODO: super() 호출
        super(floors);                                  // 부모 생성자 호출하여 자식이 전달받은 값으로 초기화
    }

    void showInfo() {                                   // 자식 메서드 정의 -> 오버라이딩
        // TODO: "층수, 업무" 출력
        System.out.println(super.floors + " 업무");      // 층수(부모 클래스의 floors 필드) + " 업무" 출력
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                   // 입력받기
        String type1 = sc.next();                                              // 첫 번째 타입 입력
        int f1 = sc.nextInt();                                                 // 첫 번째 층수 입력
        String type2 = sc.next();                                              // 두 번째 타입 입력
        int f2 = sc.nextInt();                                                 // 두 번째 층수 입력
        // TODO: 위 House 및 Office 클래스 구현 완료 후 아래 주석 해제
        // 첫번째 타입이 house 이면 House 객체 생성하여 b1이 참조
        // 아니면, Office 객체 생성하여 b1이 참조                 => 다형성
        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);
        // 두번째 타입이 house 이면 House 객체 생성하여 b2가 참조
        // 아니면, Office 객체 생성하여 b2가 참조                 => 다형성
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);
        b1.showInfo();                                                         // b1이 참조하는 showInfo() 메서드 호출
        b2.showInfo();                                                         // b2가 참조하는 showInfo() 메서드 호출
    }
}

/*
     [ 부모 클래스의 추상(abstract) 메서드 ]
       - 이 메서드는 반드시 자식에서 구현해야 함
       - 자식 클래스에서 이 메서드 구현 시 abstract 쓰지 않음
          -> 구현부(바디) 작성해야 하기 때문

     [ 추상(abstract) 클래스 ]
       - abstract 키워드 붙은 클래스
       - 객체(인스턴스) 직접 생성 불가 -> 해당 클래스/ main 어디에서 직접 생성 불가!
            ex. Building b = new Building(f1)  안 됨
       - 자식 클래스에서 구현(오버라이딩) 후, 자식 클래스 통해 객체 생성 가능
            ex. 자식 클래스에서 오버라이딩(void showInfo()) 후,
                  `Building b = new House(f1)` 처럼 부모 타입으로 참조 가능 => "다형성"

     [ 추상(abstract) 메서드 ]
       - 선언만 있고 몸체(구현)가 없는 메서드
       - 반드시 추상 클래스 안에서만 선언 가능
       - 자식 클래스가 반드시 구현(오버라이딩) 해야 함

     @@ 참고 @@
       - 추상 클래스가 무조건 추상 메서드를 가져야 하는 건 아님
       - 추상 메서드는 반드시 추상 클래스 안에 있어야 함
       - "다형성" = 하나의 타입(부모)으로 여러 가지 형태(자식)를 참조 가능
 */