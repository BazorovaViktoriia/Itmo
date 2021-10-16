package com.ifmo.lesson2;
import  java.lang.Math.*;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 3, b = 9, c = -1;

        String ordering = ordering(a, b, c);

        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        int min, max;
        int mid = 0;
      min = Math.min(a,b);
      min = Math.min(min,c);
      max = Math.max(a,b);
      max = Math.max(max,c);
      if (a!=max&&a!=min) {
          mid = a;
      }
        if (b!=max&&b!=min) {
            mid = b;
        }
        if (c!=max&&c!=min) {
            mid = c;
        }

        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
                "Возрастающая последовательность: " + min + ", " + mid + ", " + max;
    }
}
