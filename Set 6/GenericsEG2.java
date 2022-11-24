package com.company;

public class GenericsEG2<T> {
    T obj;

    GenericsEG2(T obj) {
        this.obj = obj;
        System.out.println("State: " + obj.getClass().getName());
    }
}
