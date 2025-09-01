package main.java.workbook3.accesslevel;

import java.util.Scanner;

class SecureFile {                                               // 클래스 정의
    private String fileName;                                     // 인스턴스 필드 선언 -> private (외부 직접 접근 불가)

    SecureFile(String fileName) {                                // 생성자 정의
        this.fileName = fileName;                                // 전달받은 값으로 초기화
    }
    public void read(boolean hasPermission) {                    // read 메서드 정의 (권한 검증)
        // TODO: 권한이 있으면 파일 이름 출력, 없으면 "권한 없음" 출력
        if(hasPermission) {                                      // 권한 있으면 (true)
            System.out.println("Reading " + this.fileName);      // "Reading " + 파일 이름 출력
        } else {                                                 // 권한 없으면 (false)
            System.out.println("권한 없음");                       // "권한 없음" 출력
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                      // 입력 받기
        String file = sc.next();                                  // 파일 이름 입력
        String p1 = sc.next();                                    // 첫 번째 권한 여부 입력
        String p2 = sc.next();                                    // 두 번째 권한 여부 입력
        SecureFile sf = new SecureFile(file);                     // 객체 생성하려 sf가 참조
        sf.read(p1.equals("granted"));                            // p1 권한 검증 후 출력
        sf.read(p2.equals("granted"));                            // p2 권한 검증 후 출력
    }
}