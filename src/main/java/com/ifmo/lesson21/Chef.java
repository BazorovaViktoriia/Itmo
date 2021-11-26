package com.ifmo.lesson21;

import java.util.Scanner;

public class Chef extends Thread {

    public void cooking(String str){
        System.out.println("Chef cooked "+str);
    }

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);                           // Название блда будет считываться с консоли
        System.out.println("Введите название желаемого блюда");
        String str = sc.nextLine();
        Order order = new Order(str);
        cooking(order.getNameDish());
        notify();
    }
}
