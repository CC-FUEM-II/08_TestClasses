package com.cc.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {

    Rechner rechner= new Rechner();

    @Test
    public void testAdd() {

        int c = rechner.add(2, 2);
        assertEquals(4, c );


    }
}
