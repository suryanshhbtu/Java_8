package com.java8.AlterInterface;

public interface Actor {
    void act();
    void speak();
    /*
    *   Java 8 has introduced the functionality of default method declaration
    *   earlier modifying interface after declaration was crime, but now
    *   its good to go.
    *   By default all method in interface are public
    * */
    default void comedy(){
        System.out.println("Actor can make some People Laugh");
    }
}

