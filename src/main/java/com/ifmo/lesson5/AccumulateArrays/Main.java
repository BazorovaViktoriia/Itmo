package com.ifmo.lesson5.AccumulateArrays;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Accumulate acc = new Accumulate(new int[]{0,0}, new Operations[]{new Plus(), new Minus()});
        acc.accumulate(1);
        acc.accumulate(6);

        System.out.println(acc);
    }
}

