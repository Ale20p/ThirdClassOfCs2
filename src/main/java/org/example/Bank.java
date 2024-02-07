package org.example;

import java.util.Scanner;

public class Bank {
    double salary;

    public Bank() {
        this.salary = 10000.00;
    }

    public void withdrawal() {
        Scanner console = new Scanner(System.in);
        double amountToWith = console.nextDouble();
        if (amountToWith > salary) {
            System.out.println("Cannot withdraw an amount that exceeds your total amount.");
        } 
        salary = salary - amountToWith;
    }
    public void deposit() {
        Scanner console = new Scanner(System.in);
        double amountToDeposit = console.nextDouble();
        salary = salary + amountToDeposit;
    }
    public void display() {
        System.out.println(salary);
    }
}
