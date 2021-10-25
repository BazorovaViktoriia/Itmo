package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();
        int[] unevenArray = unevenArray();
        for (int i=0; i<unevenArray.length; i++) {
            System.out.printf(unevenArray[i]+" " );
        }
        System.out.println("");

        for (int i=49; i>=0; i--) {
            System.out.printf(unevenArray[i]+" ");
        }

    }

    public static int[] unevenArray() {
       int [] array = new int[50];
       for (int i=0, n=1; i< array.length; n+=2, i++){
            array[i] = n;
        }
        return array;
    }
}
