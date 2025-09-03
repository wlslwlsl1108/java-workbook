package main.java.workbook3.exception;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            // TODO: s를 int로 변환 후 2 곱해 출력
            System.out.println(Integer.parseInt(s) * 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}

/*
    [ Integer.parseInt(s) ]

       - 문자열을 int로 변환
       - 이 때, 모든 문자열이 아닌 숫자 형태의 문자열만 int로 변환
       - 숫자 형태가 아닌 문자열 경우 "예외" 구문으로 빠짐

 */