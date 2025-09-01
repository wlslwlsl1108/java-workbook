package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Account {                           // 클래스 정의
    private int balance;                  // 잔액 private 선언 -> 직접 접근 불가

    Account(int balance) {                // 생성자 정의
        this.balance = balance;           // 전달 받은 값으로 초기화
    }

    public void deposit(int amount) {     // 입금 메서드
        // TODO: balance 증가
        balance += amount;                // 잔액 = 잔액 + 입금액
    }
    public void withdraw(int amount) {    // 출금 메서드
        // TODO: balance 감소
        balance -= amount;                // 잔액 = 잔액 - 출금액
    }
    public int getBalance() {             // 직접 접근 불가하므로 get 메서드 생성 (getter)
        return balance;                   // 잔액 반환
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 받기
        int bal = sc.nextInt();                 // 초기 잔액 입력
        String cmd1 = sc.next();                // 첫 번째 `입금` or `출금` 입력
        int amt1 = sc.nextInt();                // 첫 번째 `입금액` or `출금액` 입력
        String cmd2 = sc.next();                // 두 번째 `입금` or `출금` 입력
        int amt2 = sc.nextInt();                // 두 번째 `입금액` or `출금액` 입력

        Account acc = new Account(bal);         // Account 객체 생성하여 acc가 참조

        if (cmd1.equals("deposit")) {           // 만약 첫 번째 입력값이 입금(deposit)이면
            acc.deposit(amt1);                  // deposit 메서드 호출 -> 잔액 증가
        } else {                                // 첫 번째 입력값이 출금(withdraw)이면
            acc.withdraw(amt1);                 // withdraw 메서드 호출 -> 잔액 감소
        }

        if (cmd2.equals("deposit")) {           // 만약 두 번째 입력값이 입금(deposit)이면
            acc.deposit(amt2);                  // deposit 메서드 호출 -> 잔액 증가
        } else {                                // 두 번째 입력값이 출금(withdraw)이면
            acc.withdraw(amt2);                 // withdraw 메서드 호출 -> 잔액 감소
        }
        System.out.println(acc.getBalance());   // 최종 잔액 출력 (getter 활용)
    }
}