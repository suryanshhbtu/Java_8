package com.java8.AlterInterface;

public class Villian implements Actor {

    @Override
    public void act() {
        System.out.println("Actor can act");
    }

    @Override
    public void speak() {
        System.out.println("Actor need to communicate");
    }
}
