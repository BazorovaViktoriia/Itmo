package com.ifmo.lesson5.Accumulate;

public class Accumulator {
    private int value;
    private Operation op;

    public Accumulator(int startValue, Operation op) {
        this.value = startValue;
        this.op = op;
    }

    public int getValue() {
        return this.value;
    }

    public void accumulate(int a) {
        this.value = this.op.calculate(this.getValue(), a);
    }
}

