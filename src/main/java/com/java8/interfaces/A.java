package com.java8.interfaces;

public class A implements I {
    /*
    * If static method is causing ambiguity it should be overcome by method hiding.
    *    (same signature with same keyword (static)).
    * */
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.showMe();

        // static method
        I.printTree();
        J.printTree();
        A.printTree();
    }

    static void printTree() {
        System.out.println("Static Method Of A class");
    }

    @Override
    public void add() {
        System.out.println("Adding");
    }

    @Override
    public void show() {
        I.super.show();
    }
}
