package main.java.workbook3.constructor;

import java.util.Scanner;

class Complex {                // Complex 클래스
    int real;                  // 인스턴스변수(필드) real, imag
    int imag;

    Complex() {                     // 기본생성자 -> real, imag 기본값 : 0
    }

    Complex(int real, int imag) {   // 매개변수 real, imag 갖는 생성자
        this.real = real;           // 필드 real에 입력받은 매개변수 real 값으로 초기화
        this.imag = imag;           // 필드 imag에 입력받은 매개변수 imag 값으로 초기화
    }
    Complex add(Complex other) {    // Complex add 메서드
        this.real += other.real;    // real 값에 [real + other.real] 값 대입
        this.imag += other.imag;    // imag 값에 [imag + other.imag] 값 대입
        return this;                // 수정된 this 반환 (새 객체 생성x)
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // Scanner 생성
        int r1 = sc.nextInt();                             // 첫 번째 real 값 입력
        int i1 = sc.nextInt();                             // 첫 번째 imag 값 입력
        int r2 = sc.nextInt();                             // 두 번째 real 값 입력
        int i2 = sc.nextInt();                             // 두 번째 imag 값 입력
        // TODO: 생성자 작성 후 아래 주석 해제
        Complex c1 = new Complex(r1, i1);                  // Complex(r1, i1) 을 c1에 참조를 저장
        Complex c2 = new Complex(r2, i2);                  // Complex(r2, i2) 을 c2에 참조를 저장
        Complex sum = c1.add(c2);                          // c1.add(c2) 호출하여 c1의 real, imag 값 변경됨
        // -> 변경된 c1(this) 반환하여 sum에 저장
        //       (sum과 c1이 같은 객체 참조)
        // TODO: sum.real과 sum.imag 출력
        System.out.println(sum.real + " " + sum.imag);     // sum.real 과 sum.imag 출력 (공백으로 구분)
    }
}
