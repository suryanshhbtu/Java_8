package com.java8.interfaces;

public class B implements I, J{
   /*
   * Diamond Problem Occurs implicitly in Java 8,
   * because of default and static methods
   *
   * */
    public static void main(String[] args) {
        B b = new B();
        b.showMe();
    }

    @Override
    public void add() {
        System.out.println("Adding");
    }

    @Override
    public void show() {
        I.super.show();
    }

    @Override
    public void showMe() {
        J.super.showMe();
    }
}
