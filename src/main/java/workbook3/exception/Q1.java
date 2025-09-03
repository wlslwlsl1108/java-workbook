package main.java.workbook3.exception;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            // TODO: a/b 결과 출력
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
