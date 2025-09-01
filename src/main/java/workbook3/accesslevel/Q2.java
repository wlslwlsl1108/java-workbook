package main.java.workbook3.accesslevel;

import java.util.Scanner;

class Student {                           // 클래스 정의
    private String name;                  // 인스턴스 필드 선언 (private -> 직접 접근 불가)

    public void setName(String name) {    // set 메서드 생성 (setter)
        // TODO: name 설정
        this.name = name;                 // name 설정
    }
    public String getName() {             // get 메서드 생성 (getter)
        // TODO: name 반환
        return name;                      // name 반환
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력 받기
        String n = sc.next();                   // 이름 입력
        Student s = new Student();              // Student() 객체 생성하여 s가 참조
        s.setName(n);                           // s가 참조하는 setName 메서드 호출 -> setter 이용하여 이름 설정
        System.out.println(s.getName());        // s가 참조하는 getName 메서드 호출 -> getter 이용하여 이름 반환
    }
}

/*
      @@ setter = 입력 받은 값으로 필드 설정
         getter = 설정한 필드 반환
 */