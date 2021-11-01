package com.company;

import static org.junit.Assert.assertEquals;

public class Line {
    int y;
    int x = 10;

    static double actual = 28.00;

    public static void main(String[] args) {
        Line one = new Line();
        double answer = one.findY(2, 5);
        assertEquals(answer, actual, 0.0);
        System.out.println("Answer " +answer);
    }

    private double findY(int m, int c) {
        y = m*x +c;
        return y;
    }
}
