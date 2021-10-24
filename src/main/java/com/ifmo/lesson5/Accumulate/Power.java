package com.ifmo.lesson5.Accumulate;

public class Power implements Operation {
    public Power() {
    }

    public int calculate(int a, int b) {
        return (int)Math.pow((double)a, (double)b);
    }
}