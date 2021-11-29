package com.ifmo.lesson21;

import java.util.Scanner;

public class Chef extends Thread {

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);                           // Название блюда будет считываться с консоли
        System.out.println("Введите название желаемого блюда");
        String str = sc.nextLine();
        Order order = new Order(str);
        order.cooking(order.getNameDish());

    }
}
