package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        int [] array = new int[11];
        array[0]=1;
        array[1]=1;
        for (int i=2; i<=10; i++) {
            array[i]=array[i-2]+array[i-1];
        }

        for (int i :array) System.out.println(i);
    }
}
