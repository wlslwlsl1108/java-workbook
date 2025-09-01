package main.java.workbook3.thissuper;

import java.util.Scanner;

class Animal {                                          // 부모 클래스
    String name;                                        // 인스턴스 필드 name

    Animal(String name) {                               // 부모 생성자 정의 -> Animal
        System.out.println("Animal constructor");       // "Animal constructor" 출력
        this.name = name;                               // 전달받은 name 으로 필드 name 초기화
    }
}

class Dog extends Animal/* TODO: Animal 클래스 상속 */ {  // 자식 클래스 (Animal 상속)
    Dog(String name) {                                  // 자식 생성자 정의 -> Dog
        // TODO: super() 호출
        super(name);                                    // 부모 생성자 호출하여 자식이 전달받은 name 값으로 초기화
        System.out.println("Dog constructor");          // "Dog constructor" 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 입력 받기
        String n = sc.next();                           // 문자열 입력 (이름)
        Dog dog = new Dog(n);                           // Dog 객체 생성하여 dog가 참조 => [ super -> 부모생성자 -> 자식생성자 ]
        // TODO: Dog 클래스 완성 후 아래 주석 해제
        System.out.println(dog.name);                   // dog가 참조하는 name 출력
    }
}