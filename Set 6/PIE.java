package com.company;

public class PIE {
    public static void main(String args[])
    {
        String str="";
        double val=0.0D,ab=22.0;
        for(int i=1;i<=2000;i++)
        {
            val=ab/7.0;
            str=Double.toString((val));
            System.out.print(str);
            ab=val;
        }


    }
}
