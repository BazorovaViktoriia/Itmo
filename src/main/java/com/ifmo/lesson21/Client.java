package com.ifmo.lesson21;

public class Client extends Thread {



    @Override
    public void run() {
        Waiter waiter = new Waiter();
        waiter.start();

    }
}
