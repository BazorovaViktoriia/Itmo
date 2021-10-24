package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        int a = 997;
       while (true) {

           System.out.println(a+=3);
           if (a>=9997) break;
        }
    }
}
