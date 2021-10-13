package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        for (int i :fibonacciNumbers) System.out.println(i);
    }

    public static int[] fibonacciNumbers() {
        int [] array = new int[20];
        array[0]=1;
        array[1]=1;
        for (int i=2; i<=19; i++) {
            array[i]=array[i-2]+array[i-1];
        }

        return array;
    }

}
