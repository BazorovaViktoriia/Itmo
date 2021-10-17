package com.ifmo.lesson2;

import java.util.Arrays;
import java.lang.Math.*;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        double[] arr = new double[2];
        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            arr[0] = (-b - Math.sqrt(dis)) / (2 * a);
            arr[1] = (-b + Math.sqrt(dis)) / (2 * a);
        }
        else if (dis == 0) {
            arr[0] = -b / (2 * a);
        }

        return arr;
    }
}
