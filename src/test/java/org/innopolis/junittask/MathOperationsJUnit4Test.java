package org.innopolis.junittask;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsJUnit4Test {

    @org.junit.Test
    public void jUnit4Add() {
        System.out.println("\n ----- JUnit4 ADD is running ----- \n");

        MathOperationsJUnit4 mathOperations = new MathOperationsJUnit4();
        int expected = 4;
        int actual = mathOperations.addJ4(2, 2);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void jUnit4Substract() {
        System.out.println("\n ----- JUnit4 SUBSTRACT is running ----- \n");

        MathOperationsJUnit4 mathOperations = new MathOperationsJUnit4();
        int expected = 77;
        int actual = mathOperations.substractJ4(100, 33);
        assertEquals(expected, actual);
    }
}