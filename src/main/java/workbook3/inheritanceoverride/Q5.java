package main.java.workbook3.inheritanceoverride;

import java.util.Scanner;

abstract class Account {                                  // 부모 클래스 -> 추상 클래스
    int balance;                                          // 잔액 필드 선언
    Account(int balance) {                                // 생성자 정의
        this.balance = balance;                           // 전달받은 잔액(balance)으로 필드 초기화
    }

    /** 기본 입금: 수수료·이자 없음 */
    void deposit(int amount) {                            // 기본 입금 메서드
        balance += amount;                                // -> 잔액 = 잔액 + 입금액
    }

    /** 기본 인출: 수수료·이자 없음 */
    void withdraw(int amount) {                           // 기본 인출 메서드
        balance -= amount;                                // -> 잔액 = 잔액 - 출금액
    }
}

class SavingsAccount extends Account {                    // 자식 클래스 -> 부모(Account) 클래스 상속
    SavingsAccount(int balance) {                         // 생성자 정의
        super(balance);                                   // 부모 생성자 호출하여 자식이 전달받은 값으로 초기화
    }

    /** 입금 시 5 % 이자 포함 */
    @Override
    void deposit(int amount) {                            // 입금 시 5% 이자 포함 메서드 => 오버라이딩
        // TODO: 5 % 이자 포함 로직 작성
        balance += amount;                                // 잔액 = 잔액 + 입금액
        balance *= 1.05;                                  // 입금 시 5% 이자 추가
    }
}

class CheckingAccount extends Account {                   // 자식 클래스 -> 부모(Account) 클래스 상속
    CheckingAccount(int balance) {                        // 생성자 정의
        super(balance);                                   // 부모 생성자 호출하여 자식이 전달받은 값으로 초기화
    }

    /** 인출 시 1 % 수수료 차감 */
    @Override
    void withdraw(int amount) {                           // 인출 시 1% 수수로 차감 메서드 => 오버라이딩
        // TODO: 1 % 수수료 차감 로직 작성
        balance -= amount;                                // 잔액 = 잔액 - 출금액
        balance *= 0.99;                                  // 출금 시 1% 수수료 차감
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                         // 입력 받기

        /* ---------- 계좌 생성 ---------- */
        String kind = sc.next(); // "saving" or "checking"           // 계좌 선택 -> "saving" 또는 "checking" 입력
        int initBal = sc.nextInt();                                  // 계좌 금액 입력

        // TODO: 아래 [알맞은 타입 선언]에 알맞은 타입을 선언 후 주석 해제

        Account acc = kind.equals("saving")                          // 계좌가 "saving" 이라면
                ? new SavingsAccount(initBal)                        // SavingsAccount 객체 생성
                : new CheckingAccount(initBal);                      // 아니면("checking" 이면) CheckingAccount 객체 생성

        /* ---------- 명령 반복 ---------- */
        while (sc.hasNext()) {                                       // 명령 반복
            String cmd = sc.next(); // deposit / withdraw            // 입금/인출 선택 입력
            int amount = sc.nextInt();                               // 금액입력

            // TODO: 계좌 생성 주석 해제 후 아래 주석 해제
            if (cmd.equals("deposit")) {                             // 입력값이 "deposit" 이면
                acc.deposit(amount);                                 // acc가 참조하는 deposit 메서드 호출 -> [입금] Savings는 이자 적용
            } else { // withdraw                                     // 아니면 ("withdraw" 이면)
                acc.withdraw(amount);                                // acc가 참조하는 withdraw 메서드 호출 -> [출금] Checking은 수수료 적용
            }
            System.out.println(acc.balance);                         // acc가 참조하는 잔액(balance) 출력
        }
    }
}

/*
      위 코드에서
     [ SavingsAccount ]
        - 입금할 때마다 5% 이자 붙는 구조
        - "deposit" 입금   -> 오버라이딩 된 메서드 사용 ( 자식클래스, 입금 시 5% 이자 포함 메서드 )
        - "withdraw" 출금  -> 기본 인출 메서드 사용 ( 부모클래스 )

     [ CheckingAccount ]
        - 출금할 때마다 1% 수수료 빠지는 구조
        - "deposit" 입금   -> 기본 입금 메서드 사용 ( 부모클래스 )
        - "withdraw" 출금  -> 오버라이딩 된 메서드 사용 ( 자식클래스, 인출 시 1% 수수로 차감 메서드 )
 */