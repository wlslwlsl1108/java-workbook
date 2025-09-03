package main.java.workbook3.exception;

import java.util.Scanner;

class FileMissingException extends Exception {
    FileMissingException(String msg) {
        super(msg);
    }
}

public class Q6 {
    static void openFile(String name) throws FileMissingException {
        // TODO: 파일이 없다고 가정하고 예외 throw
        name = null;
        if (name == null) {
            throw new FileMissingException("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        try {
            openFile(filename);
        } catch (FileMissingException e) {
            System.out.println("File not found");
        }
    }
}
