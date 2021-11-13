package com.ifmo.lesson6;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        for (Object o : list) {
            System.out.println(o);
        }

        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
