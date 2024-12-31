package com.java8.interfaces;

public interface J {

    void add();
    void show();
    default void showMe(){
        System.out.println("showMe: J");
    }
    static void printTree(){
        System.out.println("Static Method Of Interface J");
    }
}
