package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q2 {
    // TODO: max 메서드 오버로딩 (int,int)와 (int,int,int)
    static int max(int a, int b) {   // 두 정수 중 큰 수 구하는 메서드
        return a > b ? a : b;        // a > b 맞으면 a , 틀리면 b 반환
    // Math.max(a, b) 쓰면 간단하게 작성 가능
    }

    static int max(int a, int b, int c) {   // 세 정수 중 큰 수 구하는 메서드
       if (a > b){                          // a > b 조건
            if (a > c){                     // [a > b] + [a > c] 이면
                return a;                   // a 반환
            } else {                        // [a > b] + [c >= a] 이면
                return c;                   // c 반환
            }
        } else if (b > c){                  // [b >= a] + [b > c] 이면
            return b;                       // b 반환
        }else {                             // [b >= a] + [c >= b] 이면
            return c;                       // c 반환
        }
    // Math.max(a, Math.max(b, c)); 로 가능
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Scanner 생성
        int a = sc.nextInt();                      // 첫 번째 정수 1개 읽어 a 에 저장
        int b = sc.nextInt();                      // 두 번째 정수 1개 읽어 b 에 저장
        int c = sc.nextInt();                      // 세 번째 정수 1개 읽어 c 에 저장
        // TODO: max 메서드 작성 후 아래 주석 해제
        System.out.println(max(a,b));              // max(a,b)메서드 호출하여 출력 -> 두 정수 중 큰 수
        System.out.println(max(a,b,c));            // max(a,b,c)메서드 호출하여 출력 -> 세 정수 중 큰 수

        sc.close();                                // 입력 닫기
    }
}

/*
   [ 세 수 비교 -> 삼항연산자 사용시 ]

      int maxAB = a > b ? a : b;    -> 가독성을 위해 변수에 담음
      return maxAB > c ? maxAB : c;
 */

/*
   [ Math.max 활용 ] -> 정수/실수 모두 가능

      1. 두 수
         Math.max(a, b)

      2. 세 수
         Math.max(a, Math.max(b, c))

 */