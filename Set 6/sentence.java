package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        System.out.println("Total Digits = "+dig_cal(str));
        System.out.println("Total Small Characters = "+sm_cal(str));
        System.out.println("Total Capital Characters = "+cap_cal(str));
        System.out.println("Total Alphabets = "+(sm_cal(str)+cap_cal(str)));
        System.out.println("Total Special Characters = "+spc_cal(str));
    }
    static int dig_cal(String str)
    {
        int c=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if((int)(str.charAt(i))>=48 &&( int)(str.charAt(i))<=57 )
                c++;
        }
        return c;
    }
    static int sm_cal(String str)
    {
        int c=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if((int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122)
                c++;
        }
        return c;
    }
    static int cap_cal(String str)
    {
        int c=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90)
                c++;
        }
        return c;
    }
    static int spc_cal(String str)
    {
        int c=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(!(((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90)||((int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122)||((int)(str.charAt(i))>=48 &&( int)(str.charAt(i))<=57 )||str.charAt(i)==' '))
                c++;
        }
        return c;
    }
}
