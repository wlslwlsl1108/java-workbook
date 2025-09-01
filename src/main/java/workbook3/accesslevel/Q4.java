package main.java.workbook3.accesslevel;

import java.util.Scanner;

class LibraryBook {                                 // 클래스 정의
    private String title;                           // 인스턴스 필드 선언 -> private (외부 직접 접근 불가)
    private String author;                          // 인스턴스 필드 선언 -> private (외부 직접 접근 불가)

    LibraryBook(String title, String author) {      // 생성자 정의
        this.title = title;                         // 전달받은 필드값으로 초기화
        this.author = author;                       // 전달받은 필드값으로 초기화
    }

    // TODO: title getter
    public String getTitle() {                      // getTitle() 메서드 정의 -> getter
        return title;                               // title 반환
    }
    // TODO: author getter
    public String getAuthor() {                     // getAuthor() 메서드 정의 -> getter
        return author;                              // author 반환
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              // 입력 받기
        LibraryBook[] books = new LibraryBook[3];         // 길이 3인 배열 객체 생성하여 books가 참조
        for (int i = 0; i < 3; i++) {                     // 배열 길이 만큼 반복 (3번)
            String t = sc.next();                         // 제목 입력
            String a = sc.next();                         // 저자 입력
            books[i] = new LibraryBook(t, a);             // 새로운 LibraryBook 객체 생성하여 books 배열에 저장
        }
        // TODO: 등록한 모든 도서들의 title, author를 출력
        for (int i = 0; i < books.length; i++) {          // 배열의 모든 요소 반복
            // getter 이용하여 각 요소의 저자, 작가를 공백으로 구분하여 출력
            System.out.println(books[i].getTitle() +  " " + books[i].getAuthor());
        }
    }
}
