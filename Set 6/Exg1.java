package com.company;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Exg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String nameofP=sc.nextLine();
        System.out.println("Enter Your Phone Number");
        Integer phno=sc.nextInt();
        Registry Person=new Registry(nameofP,phno);
        greet.accept(Person);

    }
    static Consumer<Registry> greet=(register) -> System.out.println("Hello Admin: "+register.name+", Thank You for Registering Phone Number: "+register.phone);
    static class Registry
    {
        private final String name;
        private final Integer phone;

        Registry(String name, Integer phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
