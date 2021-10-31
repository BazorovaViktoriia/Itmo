package com.ifmo.lesson5.Shape;

public class Circle extends Square {

    @Override
    public double square1 () {

        return super.square1()*Math.PI;
    }
}