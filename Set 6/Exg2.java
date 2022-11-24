package com.company;

import java.util.function.BiFunction;

public class Exg2 {
    public static void main(String[] args) {
        System.out.println("The Answer is :"+addMul.apply(5,2));
    }
    static BiFunction<Integer,Integer,Double> addMul=(num1,num2) ->{return Math.pow(num1+1,num2); };


}
