package com.ifmo.lesson3;

import java.util.Random;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        for (int i:randomNumbers) System.out.print(i+" ");
        System.out.println("");
        if (isIncreasingSequence(randomNumbers)) {
            System.out.println("Массив является строго возрастающим");
        }
        else
        System.out.println("Массив не является строго возрастающим");

    }

    public static int[] randomNumbers() {
        Random number = new Random();
        int [] array = new int[4];
        for (int i=0; i<array.length; i++) {
            array[i] = 10 + number.nextInt(99);
        }
        return array;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        boolean flag = true;
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] <= randomNumbers[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
