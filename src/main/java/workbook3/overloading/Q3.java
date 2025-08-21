package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q3 {
    // TODO: concat 메서드 오버로딩
    // 두 문자열 이어붙이는 메서드 //
    static String concat(String s1, String s2){              // String s1, String s2 매개변수로 갖는 객체 생성없이 호출 가능한 메서드
        return s1 + s2;                                      // 두 문자열을 이어붙여 반환
    }
    // 세 문자열 이어붙이는 메서드 //
    static String concat(String s1, String s2, String s3) {  // 세 문자열 이어붙이는 메서드(객체 생성없이 호출 가능, 반환타입 String)
        return s1 + s2 + s3;                                 // 세 문자열을 이어붙여 반환
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Scanner 생성
        String s1 = sc.next();                               // 첫 번째 문자열을 읽어 s1에 저장
        String s2 = sc.next();                               // 두 번째 문자열을 읽어 s2에 저장
        String s3 = sc.next();                               // 세 번째 문자열을 읽어 s3에 저장
        // TODO: concat 메서드 작성 후 아래 주석 해제
        System.out.println(concat(s1,s2));                   // concat(s1, s2)메서드 호출하여 출력
        System.out.println(concat(s1,s2,s3));                // concat(s1, s2, s3)메서드 호출하여 출력

        sc.close();                                          // 입력 닫기
    }
}
