package com.company;

import java.util.Scanner;

public class Sent2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str=sc.nextLine();
        char ch=' ';
        int dcal=0,smcal=0,capcal=0,spccal=0,vowcal=0,wocal=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            ch=str.charAt(i);
            int val=(int)ch;
            char ch1=Character.toUpperCase(ch);
            if(val>=65 && val<=90)
                capcal++;
            else if(val>=97 && val<=122)
                smcal++;
            else if(val>=48 && val<=57)
                dcal++;
            else if(ch==' ')
                wocal++;
            else if(ch1=='A' || ch1=='B' || ch1=='C' || ch1=='D' || ch1=='E')
                vowcal++;
            else
                spccal++;

        }
        System.out.println("Total Digits = "+dcal);
        System.out.println("Total Small Characters = "+smcal);
        System.out.println("Total Capital Characters = "+capcal);
        System.out.println("Total Special Characters = "+spccal);
        System.out.println("Total Vowels = "+vowcal);
        System.out.println("Total Words = "+wocal);
        System.out.println("Total Alphabets = "+(smcal+capcal));

    }
}
