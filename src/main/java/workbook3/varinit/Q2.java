package main.java.workbook3.varinit;

public class Q2 {
    static int count;                           // static(정적) 변수 count 선언
    static {                                    // 정적 초기화 블럭 -> 클래스 로딩 시 1회 실행
        // TODO: count 초기화
        count = 5;                              // count 값을 5로 초기화
    }
    public static void main(String[] args) {

        System.out.println(count);              // count 출력
    }
}

/*
     [ static (정적변수, 정적 초기화 블록) ]
         - 클래스가 JVM에 로딩될 때 1번만 초기화
         - 즉, 객체 여러개 생성해도 static 변수는 공유됨 (초기화 다시 x)

     [ 인스턴스 변수 (non-static) ]
         - new 키워드로 객체 생성시마다 초기화
         - 객체 여러개 생성될 때마다 초기화

          ex. Class InitDemo {
                  int a = 10;      // 명시적 초기화
                  {
                      System.out.println("인스턴스 초기화 블록 실행")
                      a = 20;
                   }
                   InitDemo() {
                      System.out.println("생성자 실행")
                   }
              }

              public clas Test {
                  public static void main(String[] args) {
                      new Demo();    // 첫 번째 객체
                      new Demo();    // 두 번째 객체
                  }
              }

              => 인스턴스 초기화 블록 실행     // 첫 번째 객체 생성 시
                 생성자 실행
                 인스턴스 초기화 블록 실행     // 두 번째 객체 생성 시
                 생성자 실행
 */