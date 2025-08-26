package com.example.maven;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilityTest {
    @Test
    public void testAdd() {
        assertEquals(10, UtilityClass.add(7, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        UtilityClass.div(10, 0);
    }
}
