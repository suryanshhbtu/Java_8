package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachWorking {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // Consumer is an interface -> using anonymous class
        Consumer<Integer> cc = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        // here list is provider and c is consumer
        // -> each time c, calls accept method on every child
        list.forEach(cc);

        // benefit of functional Interface
        Consumer<Integer> c = i -> System.out.println(i);
        list.forEach(c);

        // this can be also done
        list.forEach(i->System.out.println(i));
    }
}
