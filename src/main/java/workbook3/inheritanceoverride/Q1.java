package main.java.workbook3.inheritanceoverride;

class Animal {                                    // Animal 클래스 -> 부모 클래스
    String name;                                  // 인스턴스 변수 name 선언

    void eat() {                                  // eat() 메서드 정의
        System.out.println("Eating...");          // "Eating..." 출력
    }
}

class Dog extends Animal {                         // Dog 클래스 -> 자식 클래스 (Animal 상속)
    public Dog() {                                 // Dog() 생성자 정의
        super.name = "Dog"; // super 키워드 맛보기   // 부모 클래스의 name 필드를 Dog로 초기화
    }
    void bark() {                                  // bark() 메서드 정의
        System.out.println("Barking...");          // "Barking..." 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();                               // Dog() 객체 생성하여 dog가 참조
        System.out.println("dog.name = " + dog.name);      // dog.name 출력
        dog.eat();                                         // Dog가 Animal 상속했기 때문에 eat() 메서드 호출 가능
        dog.bark();                                        // dog가 참조하는 bark() 메서드 호출
    }
}
