package com.ifmo.lesson5.Accumulate;

public class SquareRoot implements Operation {
    public SquareRoot() {
    }

    public int calculate(int a, int b) {
        return (int)Math.sqrt((double)(a + b));
    }
}
