package org.innopolis.junittask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsJUnit5Test {

    @Test
    void jUnit5Add() {
        System.out.println("\n ----- JUnit5 ADD is running ----- \n");

        MathOperationsJUnit5 mathOperations = new MathOperationsJUnit5();
        int expected = 4;
        int actual = mathOperations.addJ5(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void jUnit5Multiply() {
        System.out.println("\n ----- JUnit5 MULTIPLY is running ----- \n");

        MathOperationsJUnit5 mathOperations = new MathOperationsJUnit5();
        int expected = 20;
        int actual = mathOperations.multiplyJ5(10, 2);
        assertEquals(expected, actual);
    }
}