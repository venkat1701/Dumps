package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class GENERICIN {
    static <T>void display(T[] arr){
        Stream<T> st=Stream.of(arr);
        st.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Elements");
        Integer arrr[]=new Integer[10];
        for (int i = 0; i < 10; i++) {
            arrr[i] = scanner.nextInt();
        }
        display(arrr);
    }
}