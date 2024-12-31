package com.java8.AlterInterface;

public class Main {

    /*
    * Java 8 onwards we can modify the interface after we have published
    * the code.
    * */
    public static void main(String[] args) {
        Hero h = new Hero();
        Villian v = new Villian();

        h.act();
        h.speak();
        h.comedy();

        System.out.println();

        v.act();
        v.speak();
        v.comedy();
    }
}
