package com.company;

import java.util.Scanner;
import java.util.function.Function;

public class strPrime {
    static int succ_Prime;
    static int pre_Prime;
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        succ_Prime = number + 1;
        pre_Prime = number - 1;
        int mean = 0;
        int copy=number,c=0;
        boolean b= false;
        while(isPrime(number))
        {
            if(!b)
            {
                succ_Prime++;
                b=isPrime(succ_Prime);
            }
            else
            {
                c++;
                break;
            }

            if(!b)
            {
                pre_Prime--;
                b=isPrime(pre_Prime);
            }
            else {
                c++;
                break;
            }
        }

        if(c>2)
        {
            mean=(succ_Prime+pre_Prime)/2;
            if (mean<copy)
                System.out.println("It is Yes");
            else
                System.out.println("It is No");
        }
    }

}
