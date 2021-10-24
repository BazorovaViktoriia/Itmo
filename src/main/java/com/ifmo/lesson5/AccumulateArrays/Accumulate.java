package com.ifmo.lesson5.AccumulateArrays;

import com.ifmo.lesson5.Accumulate.Operation;

public class Accumulate {
    private int[] value;
    private Operations[] op;

    public Accumulate(int[] startValue, Operations[] op) {
        this.value = startValue;
        this.op = op;
    }

    public int[] getValue() {
        return this.value;
    }

    public void accumulate(int a) {
        for (int i=0; i< value.length; i++) {
            value[i]=op[i].calculate(value[i], a);
        }
    }
}