package main.java.workbook3.abstractinterface;

import java.util.Scanner;

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double base, bonus;

    FullTimeEmployee(double base, double bonus) {
        this.base = base;
        this.bonus = bonus;
    }

    double calculateSalary() {
        // TODO: 급여 계산
        return base + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourly, hours;

    PartTimeEmployee(double hourly, double hours) {
        this.hourly = hourly;
        this.hours = hours;
    }

    double calculateSalary() {
        // TODO: 급여 계산
        return hourly * hours;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        Employee e;
        if (type1.equals("full")) {
            double base = sc.nextDouble();
            double bonus = sc.nextDouble();
            e = new FullTimeEmployee(base, bonus);
        } else {
            double hourly = sc.nextDouble();
            double hours = sc.nextDouble();
            e = new PartTimeEmployee(hourly, hours);
        }
        System.out.println((int)e.calculateSalary()); // int 형태로 출력
    }
}