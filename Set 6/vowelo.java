package com.company;

public class vowelo {
    public static void main(String[] args) {
        String str="Krish";
        String str2=str.toUpperCase();
        int p=0;
        for(int i=0;i<=str2.length()-1;i++){
            char ch=str2.charAt(i);
            if((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
                System.out.println("First Occurence of Vowel in the Word: Krish is at index:"+(str2.indexOf(ch)+1)+" character :"+ch);
            p = 1;
        }
        if(p==1)
        {}
         else
            System.out.println("Not a Vowel Found !~!!");
    }

}
