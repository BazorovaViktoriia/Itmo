package com.ifmo.lesson5.Accumulate;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Accumulator acc = new Accumulator(0, new Plus());
        Accumulator acc2 = new Accumulator(0, new Minus());
        Accumulator acc3 = new Accumulator(1, new Multy());
        Accumulator acc4 = new Accumulator(1, new Divide());
        Accumulator acc5 = new Accumulator(1, new Power());
        Accumulator acc6 = new Accumulator(1, new SquareRoot());
        Accumulator acc7 = new Accumulator(1, new Mod());
        acc.accumulate(2);
        acc.accumulate(5);
        acc.getValue();
        acc2.accumulate(2);
        acc2.accumulate(5);
        acc2.getValue();
        acc3.accumulate(2);
        acc3.accumulate(5);
        acc3.getValue();
        acc4.accumulate(4);
        acc4.accumulate(2);
        acc4.getValue();
        acc5.accumulate(3);
        acc5.accumulate(2);
        acc5.getValue();
        acc6.accumulate(8);
        acc6.accumulate(8);
        acc6.getValue();
        acc7.accumulate(141);
        acc7.accumulate(5);
        acc7.getValue();
        System.out.println(acc.getValue());
        System.out.println(acc2.getValue());
        System.out.println(acc3.getValue());
        System.out.println(acc4.getValue());
        System.out.println(acc5.getValue());
        System.out.println(acc6.getValue());
        System.out.println(acc7.getValue());
    }
}