package com.company;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerEG {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= scanner.nextLine();
        System.out.println("Enter Your Phone Number");
        String phone= scanner.nextLine();
        Customer SJ=new Customer(name,phone);
        greet.accept(SJ,true);
    }
    static BiConsumer<Customer,Boolean> greet= (customer,SPN) ->
            System.out.println("Hello : "+customer.CustomerName+", thanks for Registering your Phone Number "
                    +((SPN)?customer.Phone:"**********"));
    static class Customer
    {
        private final String CustomerName;
        private final String Phone;

        Customer(String customerName, String phone) {
            this.CustomerName = customerName;
            this.Phone = phone;
        }
    }
}
