package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano plays");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar plays");
    }
}

class Drum implements Playable {
    public void play() {
        System.out.println("Drum plays");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Playable 인터페이스 타입 배열을 선언, 변수명은 instruments
        Playable[] instruments = new Playable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "piano"인 경우 Piano 타입 객체, "guitar"인 경우 Guitar 타입 객체, "drum"인 경우 Drum 타입 객체를 instruments 배열에 추가합니다.
            if (t.equals("piano")) {
                instruments[i] = new Piano();
            } else if (t.equals("guitar")) {
                instruments[i] = new Guitar();
            } else {
                instruments[i] = new Drum();
            }
        }
        // TODO: instruments 배열에 추가된 객체들의 play() 메서드를 호출합니다.
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}