package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    int[] arr = new int[5];                       // 크기 5인 배열 arr 선언/생성
    {                                             // 인스턴스 초기화 블록
        // TODO: arr 배열을 난수로 채움
        Random rand = new Random();               // Random 객체 생성
        for (int i = 0; i < 5; i++) {             // 배열 크기만큼 반복
            arr[i] = rand.nextInt(10);      // 정수 난수로 채움 (0이상 10미만)
        }
    }
    void printArray() {                           // printArray() 메서드 -> 배열 arr 출력
        // TODO: arr 요소 출력
        for (int i = 0; i < 5; i++) {             // arr 모든 요소를
            System.out.print(arr[i] + " ");       // 출력 (공백으로 구분)
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();        // RandomInit() 객체 생성하여 참조를 obj 저장
        obj.printArray();                         // obj가 참조하는 객체의 printArray() 메서드 호출 => 배열 arr 요소 출력
    }
}


/*
    [ 난수 ]
       - 실행시 마다 값이 달라짐

    [ Random 클래스]
       - 난수를 생성해주는 클래스 -> JDK 기본 제공 클래스
       - Random 클래스의 nextInt(int bound) 메서드
           -> bound = 상한값 (0 이상 bound 미만)

         ex) Random.nextInt(10)
              => 0 이상 10 미만의 정수 중 난수 반환
 */