package com.company;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class MethodsofString {
    public static void main(String[] args) {
        String str="Krish Jaiswal";
        System.out.println("charAt(): "+str.charAt(6));
        System.out.println("codePointAt(): "+str.codePointAt(5));
        System.out.println("codePointBefore(): "+str.codePointBefore(5));
        System.out.println("codePointCount(): "+str.codePointCount(0,8));
        System.out.println("compareTo(): "+str.compareTo("krish jaiswal"));
        System.out.println("compareToIgnoreCase(): "+str.compareToIgnoreCase("krish jaiswal"));
        System.out.println("concat(): "+str.concat("My Friend"));
        System.out.println("contains(): "+str.contains("hello"));
        System.out.println("contentEquals(): "+str.contentEquals("Krish Jaiswal"));
        char[] ch1={'A','B','C',' ','X','F','D'};
        System.out.println("copyValueOf(): "+str.copyValueOf(ch1));
        System.out.println("copyValueOf(char[] data,int offset,int count): "+str.copyValueOf(ch1,2,4));
        System.out.println("endsWith(String suffix): "+str.endsWith("wal"));
        System.out.println("equals(Object obj): "+str.equals("Krish"));
        System.out.println("equalsIgnoreCase(String anotherString): "+str.equalsIgnoreCase("krish jaiswal"));
        System.out.println("getBytes(): "+str.getBytes());
        try {
            System.out.println("getBytes(): "+str.getBytes("US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
