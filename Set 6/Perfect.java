package com.company;

import java.util.Scanner;
import java.util.function.Predicate;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        Integer n=sc.nextInt();
            if(isPerfect.test(n))
                System.out.println("It is a Perfect Number");
            else
                System.out.println("It is not a Perfect Number");
    }
    static Predicate<Integer> isPerfect=n ->{
       Integer sum=0;
        for(Integer i=1;i<n/2;i++)
        {
            if(n%i==0)
                sum+=i;
        }
        if(sum.equals(n))
            return true;
        else
        return false;
    };
}
