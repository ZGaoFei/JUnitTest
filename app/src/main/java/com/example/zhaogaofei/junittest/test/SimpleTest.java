package com.example.zhaogaofei.junittest.test;


public class SimpleTest {

    public int plus(int a, int b) {
        return a + b;
    }

    public int less(int a, int b) {
        /*if (a >= b) {
            return a - b;
        } else {
            return b - a;
        }*/

        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public double except(int a, int b) {
        return a / b;
    }
}
