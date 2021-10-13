package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();
        for (int i :evenArray) System.out.printf(i+" ");
        System.out.println("");
        for (int i :evenArray) System.out.println(i);

    }

    public static int[] evenArray() {
        int [] array = new int[10];
        array[0]=2;
        for (int i=1; i<=9; i++) {
            array[i]=array[i-1]+2;
        }

        return array;
    }
}
