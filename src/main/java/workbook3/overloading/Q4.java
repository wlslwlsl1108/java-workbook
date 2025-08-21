package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double base, double height)
    // 원 넓이 계산 //
    static double area(double r) {
        return r * r * Math.PI;                       // 원의 넓이 반환 (Math.PI = 3.14 대신 사용)
    }
    // 직사각형 넓이 계산 //
    static double area(double w, double h) {
        return w * h;                                 // 직사각형 넓이 반환
    }
    // 삼각형의 넓이 계산 //
    static double area(int b, int h) {
        return b * h * 0.5;                             // 삼각형 넓이 반환 (위 타입과 동일하여 에러발생으로 변수 i 추가)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // Scanner 생성
        String type = sc.next();                      // 공백,개행 전 문자열 읽어 type 에 저장
        if (type.equals("circle")) {                  // 원
            double r = sc.nextDouble();               // 반지름 입력
            System.out.println(area(r));              // 원의 넓이

        } else if (type.equals("rect")) {             // 직사각형
            double w = sc.nextDouble();               // 가로 입력
            double h = sc.nextDouble();               // 세로 입력
            System.out.println(area(w,h));            // 사각형 넓이

        } else if (type.equals("tri")) {              // 삼각형
            int b = sc.nextInt();                     // 밑변 입력
            int h = sc.nextInt();                     // 높이 입력
            System.out.println(area(b,h));            // 삼각형 넓이
        }
    }
}