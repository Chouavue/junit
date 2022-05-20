package com.win.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class CalculationsTest {
    @Test
    void Calculations() {
        int num1 = 10;
        int num2 = 5;

        int addnum = num1 + num2;
        int subtractnum = num1 - num2;
        int multiplynum = num1 * num2;
        double divisionnum = (float)num1/num2;
        int modulsnum = num1 % num2;

        assertEquals(15, addnum);
        assertEquals(5, subtractnum);
        assertEquals(50, multiplynum);
        assertEquals(2, divisionnum);
        assertEquals(0, modulsnum);
    }
}
