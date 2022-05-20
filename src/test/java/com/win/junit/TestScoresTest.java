package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestScoresTest{

    @Test
    public void TestScorest()  {
    System.out.println("Name a number between 0 and 100");
    int number = 95;
    int number2 =115;
    assertTrue(number < 100);
    assertFalse(number2 < 100);
    }
}
