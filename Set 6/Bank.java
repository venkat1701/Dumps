package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class Bank {
    static long acc_number=0L;
    static short pin=0;
    static void welcomeDetail(long acc_number,short pin)
    {
        if(Long.toString(acc_number).length()==16) {
            System.out.println("Account Number: xxxxxxxxxxxx" + Long.toString(acc_number).substring(12, 16));
            System.out.println("Press M to Manage Account Balance");
            System.out.println("Press D to Deposit Amount in the Given Account Number");
        }
        else
            System.out.println("Invalid Account Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bengal Bank");
        System.out.println("Please Enter your Account Number: ");
        acc_number=sc.nextLong();
        System.out.println("Enter PIN");
        pin=sc.nextShort();
        System.out.println("Press 1 to Get Further Details");
        System.out.println("Press 2 to Exit");
        int choice=sc.nextInt();
        switch (choice) {
            case 1 -> welcomeDetail(acc_number,pin);
            case 2 -> System.exit(0);
        }
    }
}
