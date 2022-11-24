package com.company;

public class series2 {
    public static void main(String[] args) {
        int n=5;
        double sum=0.0D;
        double root=0.0D;
        for(int i=0;i<=n-1;i++){
            root=Math.sqrt(3*Math.pow(10,i));
            sum=sum+(1.0+(i/root));
        }
        System.out.println(sum);
    }
}
