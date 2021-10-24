package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        Random rnd = new Random();
        int rundom = rnd.nextInt(900)+100;
        return rundom;
    }

    public static String largestDigit(int rnd) {
            int number=rnd;
            int max =number%10;

            while (number!=0) {
                number /= 10;
                int max1 = number % 10;
                if (max < max1) {
                    max = max1;
                }
            }

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
