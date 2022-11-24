package com.company;

public class asciival {
    public static void main(String[] args) {
        String str="Krish";
        int len=str.length()-1;
        for(int loop=0;loop<=len;loop++){
            int val=(int)str.charAt(loop);
            System.out.println("ASCII value for: "+str.charAt(loop)+" is = "+val);
        }
    }
}
