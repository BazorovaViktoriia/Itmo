package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {

        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        int cnt = 0;

        for (int h = 1; h <= 24; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h / 10 % 10 == m % 10 & h % 10 == m / 10 % 10) {
                    cnt++;
                }
            }
        }
        return cnt;
        }
    }

