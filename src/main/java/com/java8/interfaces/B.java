package com.java8.interfaces;

public class B implements I, J{
   /*
   * Diamond Problem Occurs implicitly in Java 8, (allows method declaration in interface)
   * because of default and static methods
   * 1. Here ambiguity occurs that, from which interface we should pick functionality,
   *    it can be overcome by overriding the method in child class.
   * 2. If static method is causing ambiguity it should be overcome by method hiding.
   *    (same signature with same keyword (static)).
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
