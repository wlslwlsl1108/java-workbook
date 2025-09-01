package main.java.workbook3.accesslevel;

import java.util.Scanner;

class BankAccount {                                         // 클래스 정의
    public String accountNo;                                // 인스턴스 필드 선언
    private int balance;                                    // 인스턴스 필드 선언 -> private(외부 직접 접근 불가)
    private String password = "1111";                       // 인스턴스 필드 선언 및 초기화 -> private(외부 직접 접근 불가)

    BankAccount(String accountNo, int balance) {            // 생성자 정의
        this.accountNo = accountNo;                         // 전달받은 값으로 필드 초기화
        this.balance = balance;                             // 전달받은 값으로 필드 초기화
    }

    public int getBalance(String inputPw) {                 // gerBalance 메서드 정의 (비밀번호 검증) -> getter
        // TODO: 비밀번호가 맞으면 balance 반환, 아니면 -1 반환
        if(password.equals(inputPw)) {                      // 만약 입력된 비밀번호가 등록된 비밀번호와 같으면
            return balance;                                 // 잔액 반환
        } else {                                            // 틀리면
            return -1;                                      // -1 반환
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                      // 입력 받기
        String accNo = sc.next();                                 // 계좌 번호 입력
        int bal = sc.nextInt();                                   // 잔액 입력
        BankAccount acc = new BankAccount(accNo, bal);            // 객체 생성하여 acc가 참조

        String cmd1 = sc.next();                                  // 조회(get) 입력
        String pw1 = sc.next();                                   // 비밀번호 입력
        if (cmd1.equals("get")) {                                 // 조회(get)를 입력했으면
            int res = acc.getBalance(pw1);                        // acc가 참조하는 getBalance를 호출하여 res에 저장
            System.out.println(res >= 0 ? res : "비밀번호 오류");   // res가 0보다 같거나 크면 잔액 출력, 아니면 "비밀번호 오류" 출력
        }

        String cmd2 = sc.next();                                  // 조회(get) 입력
        String pw2 = sc.next();                                   // 비밀번호 입력
        if (cmd2.equals("get")) {                                 // 조회(get)를 입력했으면
            int res = acc.getBalance(pw2);                        // acc가 참조하는 getBalance를 호출하여 res에 저장
            System.out.println(res >= 0 ? res : "비밀번호 오류");   // res가 0보다 같거나 크면 잔액 출력, 아니면 "비밀번호 오류" 출력
        }
    }
}