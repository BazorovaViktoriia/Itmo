package com.ifmo.lesson6;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Этот класс должен реализовывать следующие методы: add(), get(), remove() и iterator() из интерфейса List.
 * Если при выполнении add() в массиве нет свободных элементов, то создать новый - вдвое больше,
 * скопировать в него все значения из старого и + 1, который сейчас добавляется.
 * Удаление должно сдвинуть все элементы влево, если это требуется.
 * Например, если список с такими элементами:
 * |0|1|2|3|4|5|
 * Удаляем элемент по индексу 2:
 * |0|1|_|3|4|5|
 * Перемещаем все элементы влево:
 * |0|1|3|4|5|_|
 * Теперь при итерации по ним после 1 будет идти сразу 3, как в связном списке.
 */
public class ArrayList implements List {
    private static final int DEFAULT_SIZE = 10;
    private Object[] values;
    private int pointer = 0;
    public ArrayList() {

        this(DEFAULT_SIZE);
    }

    public ArrayList(int initialSize) {

        values = new Object[initialSize];
    }

    /** {@inheritDoc} */
    @Override
    public void add(Object val) {
        if (pointer==values.length){
            Object[] newValues = new Object[values.length*2];
            System.arraycopy(values, 0, newValues, 0, values.length);
            values = newValues;
        }
        values[pointer]=val;
        pointer++;
    }



    /** {@inheritDoc} */
    @Override
    public Object get(int i) {
        if (i<0|| i> values.length) {                 //проверка на null
            return null;
        }
                return values[i];
    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        if(i<0||i>=values.length){
            return null;
        }
        for (int n=0; n<values.length; n++) {
            if (n == i) {
                values[n] = null;
                if (values[n + 1] != null) {
                    for (int ind = n + 1; ind <values.length; ind++) {
                        values[ind] = values[ind - 1];
                    }
                }
            }
        }
        return values;
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {

        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

        }
    }

