package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    // 오버로딩 //
    static void printValue(int i){        // int 타입 인자를 받아 출력
        System.out.println(i);
    }
    static void printValue(double d){     // double 타입 인자를 받아 출력
        System.out.println(d);
    }
    static void printValue(String s){     // String 타입 인자를 받아 출력
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Scanner 생성
        int i = sc.nextInt();                   // 정수형 1개 읽어 i에 저장
        double d = sc.nextDouble();             // 실수(double)형 1개 읽어 d에 저장
        String s = sc.next();                   // 문자열 1개 읽어 S에 저장
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
        printValue(i);    // printValue(i) 메서드 호출 - int형 버전
        printValue(d);    // printValue(d) 메서드 호출 - double형 버전
        printValue(s);    // printValue(s) 메서드 호출 - String형 버전
    }
}

/* 오버로딩 구현한 printValue 메서드가 static void 로 정의해야하는 이유

    [static]
     - main 이 static 이기 때문에 다른 메서드도 static 으로 정의하면
       " 객체 생성 없이 호출 " 가능
     - 메서드가 static이 아니면, main 에서 객체 먼저 생성해야 호출 가능
         ex. Q1 q = new Q1();
             q.printValue(i)

     [void]
     - printValue 는 단순 출력용!
       즉, 반환 값이 없음
     - void 대신 자료형 사용한다면?
         ex. static String printValue(int i){
                return "입력한 정수는: " + i;
              }

              main 호출= System.out.println(printValue(i));

           -> 여기서 인자는 int 형을 받지만,
              실제로 반환하는 타입이 String 이기 때문에
              메서드 반환 타입에는 String을 적는다.
 */