package com.ifmo.lesson21;

public class Waiter extends Thread {


    @Override
    public void run() {
        Chef   chef = new Chef();
        chef.start();

    }
}
