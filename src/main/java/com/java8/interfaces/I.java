package com.java8.interfaces;

public interface I {

    void add();

    default void show(){
        System.out.println("show: I");
    }
    default void showMe(){
        System.out.println("showMe: I");
    }
}
