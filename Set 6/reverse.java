package com.company;

public class reverse {
    public static void main(String[] args) {
        String str="Krish jaiswal";
        System.out.println(rev(str));
    }
    static String rev(String str){
        int len=str.length()-1;
        String str2="";
        while(len>=0){
            str2=str2+str.charAt(len);
            len--;

        }
        return str2;
    }
}

