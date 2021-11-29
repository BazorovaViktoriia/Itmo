package com.ifmo.lesson21;

public class Order {
    String nameDish;

    public Order (String str) {
        this.nameDish=str;
    }

    public String getNameDish() {
        return nameDish;
    }

    public synchronized void cooking(String str) {
        int i = 0;
        while (i > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Chef cooked "+str);
        i++;
        notify();
    }
}