package com.company;

import java.util.Scanner;

public class Lambda {
    public static void main(String[] args) {
        Runnable r1 = ()->
        {
            Runnable r2=() -> {System.out.println("Helo");};
            r2.run();
            System.out.println("Hello");
        };
        r1.run();
    }
}
