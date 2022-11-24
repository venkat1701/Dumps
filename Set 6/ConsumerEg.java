package com.company;

import java.util.function.Consumer;

public class ConsumerEg {
    public static void main(String[] args) {
        Customer Maria=new Customer("Maria","8240704186");
        greetings.accept(Maria);
    }
    static Consumer<Customer> greetings=
            customer -> System.out.println("Hello Customer :"+customer.Customername+
                    ", Thank You for Registering your Phone Number"+customer.Phone);


    static class Customer{
        private final String Customername;
        private final String Phone;
        Customer(String Customername, String Phone)
        {
            this.Customername=Customername;
            this.Phone=Phone;
        }
    }
}
