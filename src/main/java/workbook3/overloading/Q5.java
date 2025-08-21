package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q5 {
    // TODO: format 오버로딩 (int), (String), (String,int)
    // 문자열: 값 출력 //
    static String format(String name) {
        return "문자열: " + name;                   // [ 문자열 : name ] 출력
    }
    // 정수: 값 출력 //
    static String format(int age){
        return "정수; " + age;                      // [ 정수 : age ] 출력
    }
    // 이름(나이) 출력 //
    static String format(String name, int age) {
        return name + "(" + age + ")";             // [ name(age) ] 출력
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Scanner 생성
        String name = sc.next();                   // 공백,개행 전 문자열 1개 읽어 name에 저장
        int age = sc.nextInt();                    // 다음 정수 1개 읽어 age에 저장
        // TODO: format 메서드 작성 후 아래 주석 해제
        System.out.println(format(name));          // format(name) 메서드 호출 후 출력
        System.out.println(format(age));           // format(age) 메서드 호출 후 출력
        System.out.println(format(name, age));     // format(name, age) 메서드 호출 후 출력
    }
}

/*
     큰 따옴표("")   vs   작은 따옴표('')

     [큰 따옴표("")]
        - 문자열(String) 표현 시 사용
        - String 타입으로 컴파일

     [작은 따옴표('')]
        - 문자(char) 표현 시 사용
        - char 타입으로 컴파일

 */