package org.innopolis.functions;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        assertEquals(Sum.sum(11, 22), 33);
    }
}
