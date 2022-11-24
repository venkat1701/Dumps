package com.company;

public class pattern3 {
    public static void main(String[] args) {
        String str="Java";
        int len=str.length()-1;
        for(int i=0;i<=len;i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
