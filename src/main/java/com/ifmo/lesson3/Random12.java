package com.ifmo.lesson3;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        System.out.println(maxLastIndex);
    }

    public static int[] randomNumbers() {
        int [] arr = new int[12];
        for (int i=0; i<=arr.length-1; i++) {
            arr[i]=(int)(Math.random()*25-15);
        }

        return arr;
    }

    public static int max(int[] randomNumbers) {
        int max = randomNumbers[0];
        for (int i=0; i<=randomNumbers.length-1; i++){
            if (randomNumbers[i]>max) {
                max=randomNumbers[i];
            }
        }

            return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        int last=0;
        for (int i=0; i<=randomNumbers.length-1; i++) {
        if (randomNumbers[i]==max) {
            last=i;
        }
        }
        return last;
    }
}
