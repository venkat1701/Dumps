package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main
{
    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("John", Gender.MALE),
                new Person("Maria",Gender.FEMALE),
        new Person("Aisha",Gender.FEMALE)
        );

        //Imperative Programming
        List<Person> females=new ArrayList<>();
        for(Person person:people){
            if(Gender.FEMALE.equals(person.gender))
                females.add(person);
        }
        for(Person female:females)
            System.out.println(female);

        //Declarative Functional Programming
        Predicate<Person> getBool= person-> Gender.FEMALE.equals(person.gender);
       people.stream()
                .filter(getBool)
                 .forEach(System.out::println);

    }
    static class Person
    {
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString(){
            return "Person{"+"name = "+name+"\"+gender ="+gender+'}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}