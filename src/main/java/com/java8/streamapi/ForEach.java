package com.java8.streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        // External Iterators
        for(int i : list){
            System.out.println(i);
        }
        Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        // Internal Iterators
        list.forEach(System.out::println);
    }
}
