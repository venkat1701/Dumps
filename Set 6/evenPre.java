package com.company;

import java.util.Scanner;
import java.util.function.Predicate;

public class evenPre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if(isEven.test(num))
            System.out.println("It is an Even Number");
        else
            System.out.println("It is an Odd Number");
    }
    static Predicate<Integer> isEven=n -> (n%2==0);
}
