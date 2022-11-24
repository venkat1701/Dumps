package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=str.length()-1;i>=0;i--){

            for(int k=i;k<=str.length()-1;k++)
                System.out.print(" ");

            for(int j=i;j>=0;j--){
                System.out.print(str.charAt(j));
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(str.charAt(j));

            }

            System.out.println();
        }


    }
}
