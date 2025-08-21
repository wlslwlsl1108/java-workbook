package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q6 {
    // TODO: multiply 오버로딩 (int[]), (int[][], int[][])
    // 정수 배열 - 모든 요소의 곱 //
    static int multiply(int[] arr){
        int mul = 1;                             // mul 초기화(1)
        for (int i = 0; i <arr.length; i++){     // 배열 전체 조회
            mul = arr[i] * mul;                  // 배열 요소를 전부 곱해 mul 에 저장
        }
        return mul;                              // 배열 요소의 전체 곱 반환
    }
    // 두 개의 행렬 - 행렬 곱셈 //
    static int[][] multiply(int[][] m1, int[][] m2) {
        int[][] arr = new int[m1.length][m2[0].length];      // 결과 행렬의 크기 (m1의 행, m2의 열)
        for (int i = 0; i < m1.length; i++){                 // m1의 행 개수만큼 반복
            for (int j = 0; j < m2[0].length; j++){          // m2의 열 개수만큼 반복
                arr[i][j] = 0;                               // arr 배열의 요소 초기화
                for(int k = 0; k < m1[0].length; k++){       // m1의 열 == m2의 행
                    arr[i][j] += m1[i][k] * m2[k][j];        // 행렬 곱셈
                }
            }
        }
        return arr;                                          // 행렬 곱셈 결과 반환
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    // Scanner 생성
        int type = sc.nextInt();                                // type 입력
        if (type == 2) {                                        // type == 2 이면
            int n = sc.nextInt();                               // 숫자 입력
            int[] arr = new int[n];                             // 정수형 배열 객체 생성하여 arr에 참조 저장
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();  // 배열에 값 입력
            System.out.println(multiply(arr));                  // 배열 요소의 곱 메서드 호출/출력
        } else {                                                // type 2 아닌 경우
            int[][] m1 = new int[2][2];                         // 정수형 배열 객체 생성하여 m1에 참조 저장
            int[][] m2 = new int[2][2];                         // 정수형 배열 객체 생성하여 m2에 참조 저장
            for (int i = 0; i < 2; i++) {                       // m1 배열 값 입력
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {                       // m2 배열 값 입력
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            // TODO: multiply(int[][], int[][]) 메서드 작성 후 주석 해제 아래 주석 해제
            int[][] result = multiply(m1, m2);                     // 행렬 곱셈 메서드 호출하여 result에 저장
            for (int i = 0; i < 2; i++) {                          // 행렬 곱셈 결과 조회
                for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + (j==1?"":" "));    // 행렬 곱셈 결과 출력 (열 사이 공백, 마지막 열은 공백x)
                }
                System.out.println();                              // 한 행 끝나면 개행
            }
        }
    }
}

/*
    [ 행렬 곱셈 ]

      - m1 = 행 A, 열 B
      - m2 = 행 B, 열 C    -> 곱셈 결과 = 행 A, 열 C
           => m1의 열과 m2의 행수가 같아야만 행렬 곱셈 가능

       ex) m1[2][2] * m2[2][2]
             a  b       A  B
             c  d       C  D

             = mul[2][2]
               [ [aA + bC   ,  aB + bD],
                 [cA + dC   ,  cB + dD] ]
 */