package com.ifmo.lesson3;

import java.util.Random;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        for (int i:randomNumbers) System.out.print(i+" ");
        System.out.println("");

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);
        for (int i:randomNumbers) System.out.print(i+" ");

    }

    public static int[] randomNumbers() {
        Random number = new Random();
        int [] array = new int[8];
        for (int i=0; i<array.length; i++) {
            array[i] = 1 + number.nextInt(10);
        }
        return array;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        for (int i=1; i<randomNumbers.length; i+=2) {
            randomNumbers[i]=0;
        }

        return randomNumbers;
    }
}
