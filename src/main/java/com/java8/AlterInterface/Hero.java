package com.java8.AlterInterface;

public class Hero implements Actor {

    @Override
    public void act() {
        System.out.println("Actor can act");
    }

    @Override
    public void speak() {
        System.out.println("Actor need to communicate");
    }

    @Override
    public void comedy() {
        System.out.println("Hero need to do comedy");
    }
}
