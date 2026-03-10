package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculationTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.addition(12, 8);
        assertEquals(20,result);
    }
}