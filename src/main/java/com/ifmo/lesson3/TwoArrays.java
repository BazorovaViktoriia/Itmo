package com.ifmo.lesson3;

import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();
        for (int i:randomNumbers1) System.out.print(i+" ");
        System.out.println("");
        for (int i:randomNumbers2) System.out.print(i+" ");
        System.out.println("");

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);
        if (average1>average2) System.out.println("Среднее арифметическое первого массива больше");
        if (average1<average2) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        else System.out.println("Средние арифметические равны");

    }

    public static int[] randomNumbers() {
        Random number = new Random();
        int [] array = new int[5];
        for (int i=0; i<array.length; i++) {
            array[i] = 1 + number.nextInt(5);
        }
        return array;
    }

    public static int average(int[] randomNumbers) {
        int sum = 0;
        for (int i:randomNumbers) {
            sum+=i;
        }
        int num = sum/randomNumbers.length;
        return num;
    }
}
