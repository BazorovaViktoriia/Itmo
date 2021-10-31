package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList<T> implements List<T>, Stack<T>, Queue<T> {
    /** Ссылка на первый элемент списка. */
    private Item<T> head;

    /** {@inheritDoc} */
    @Override
    public void add(T val) {
        Item<T> item = new Item<>(val);
        if (head==null){
            head=item;
        }
        else {
            Item current = head;
            while (true){
                if (current.next == null){
                    current.next = item;
                    break;
                }
                current = current.next;
            }
        }
    }


    @Override
    public T take() {
        // TODO implement.

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public T get(int i) {
        if (i<0||head ==null) {
            return null;
        }

        int cnt = 0;
        Item<T> item = head;
        while (true){
            if (cnt==i){
                return item.value;
            }
            item = item.next;
            cnt++;
        }
    }

    @Override
    public T remove(int i) {


        return null;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    /** {@inheritDoc} */
    @Override
    public void push(T value) {
        // TODO implement.
    }

    /** {@inheritDoc} */
    @Override
    public T pop() {
        // TODO implement.

        return null;
    }
}
