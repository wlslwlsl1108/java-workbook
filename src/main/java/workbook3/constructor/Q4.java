package main.java.workbook3.constructor;

import java.util.Scanner;

class Triangle {
    int a, b, c;
    Triangle() {                      // 기본 생성자
        this.a = 1;                   // a 기본값 = 1
        this.b = 1;                   // b 기본값 = 1
        this.c = 1;                   // c 기본값 = 1
    }
    Triangle(int a, int b, int c) {   // 매개변수 a, b, c를 갖는 생성자
        this.a = a;                   // 전달받은 a 값으로 a 초기화
        this.b = b;                   // 전달받은 b 값으로 b 초기화
        this.c = c;                   // 전달받은 c 값으로 c 초기화
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 // Scanner 생성
        int a = sc.nextInt();                                // 첫 번째 정수 입력
        int b = sc.nextInt();                                // 두 번째 정수 입력
        int c = sc.nextInt();                                // 세 번째 정수 입력
        Triangle t1 = new Triangle();                        // 기본생성자 호출하여 t1에 참조 저장
        Triangle t2 = new Triangle(a, b, c);                 // 매개변수 a,b,c 갖는 생성자 호출하여 t2에 참조 저장
        System.out.println(t1.a + " " + t1.b + " " + t1.c);  // t1의 a, b, c 출력 (공백으로 구분)
        System.out.println(t2.a + " " + t2.b + " " + t2.c);  // t2의 a, b, c 출력 (공백으로 구분)
    }
}

/*   [기본 생성자]
         - 지정해둔 기본값으로 초기화 (1,1,1)


     [매개변수 생성자]
         - 외부에서 전달되는 값으로 초기화 (a,b,c)
 */