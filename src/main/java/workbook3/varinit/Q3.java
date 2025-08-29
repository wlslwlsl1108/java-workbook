package main.java.workbook3.varinit;

public class Q3 {
    static int s;                                   // static 변수
    int i;                                          // 인스턴스 변수
    static {                                        // static 초기화 블록
        System.out.println("static block");         // [1] static 변수/블록 실행
    }
    {                                               // 인스턴스 초기화 블록
        System.out.println("instance block");       // [4] 인스턴스 초기화 변수/블록 실행
    }
    Q3() {                                          // 생성자
        System.out.println("constructor");          // [5] 생성자 실행
    }

    public static void main(String[] args) {
        System.out.println("static variable");      // [2] main 메서드 실행

        Q3 obj = new Q3();                          // [3] 객체 생성

        System.out.println("instance variable");    // [6] main 메서드 이어서 실행
    }
}
/*
    [ 실행 순서 ]

    1. 클래스 로딩 시점 -> static 변수/블록 실행 (1번만)
        1) static 변수
        2) static 초기화 블록  => "static block"

    2. main 메서드 실행
        - 첫줄 출력문 실행 => "static variable"

    3. 객체 생성 (new Q3())
        1) 인스턴스 변수/블록 실행 => "instance block"
        2) 생성자 실행 => "constructor"

    4. main 메서드 이어서 실행
        - 다음 출력문 실행 => "instance variable"

    ex. Q3 obj1 = new Q3();
        System.out.println("instance variable"); 2번 하는 경우

        => static block
           static variable
           instance block
           constructor
           instance variable
           instance block
           constructor
           instance variable
 */