package com.java8.interfaces;

public class A implements I{
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.showMe();
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
