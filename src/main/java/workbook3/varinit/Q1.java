package main.java.workbook3.varinit;

class InitDemo {                     // InitDemo 클래스
    int a = 10;                      // 명시적 초기화 -> a 초기화
    int b;                           // 인스턴스 필드
    {                                // 인스턴스 초기화 블록
        // TODO: b 초기화
        b = 20;                      // b 초기화
    }
    InitDemo() {                     // InitDemo() 메서드
        // TODO: a와 b의 합 출력
        System.out.println(a+b);     // a, b 합 출력
    }
}

public class Q1 {
    public static void main(String[] args) {

        new InitDemo();              // InitDemo() 객체 생성 -> 생성자 실행 -> 합 출력
    }
}

/*
   [ 명시적 초기화 ]
      - 선언과 동시에 초기화

   [ 인스턴스 필드 ]
      - 기본값 0으로 초기화됨
          ex. 정수형(int)     -> 0
              실수형(double)  -> 0.0
              boolean        -> false
              참조형          -> null

   [ 인스턴스 초기화 블록 ]
      - 중괄호 { } 로 정의된 블록
      - 객체 생성 시 생성자 호출 전에 실행됨 -> 생성자보다 먼저 실행!
      - 주로 여러 생성자에서 공통으로 수행할 초기화 코드 작성 시 사용
          ex. Class InitDemo {
                  int a = 10;
                  int b;
                  {
                      b = 20;
                      System.out.println("인스턴스 초기화 블록 실행")
                   }
                   InitDemo() {
                      System.out.println("생성자 실행")
                   }
              }

              이 경우 출력되는 화면
              => 인스턴스 초기화 블록 실행
                 생성자 실행

 */