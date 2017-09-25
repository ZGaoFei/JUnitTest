package com.example.zhaogaofei.junittest.test;


import org.junit.Before;
import org.junit.Test;

public class SuitOneTest {
    private String str = "Suit One Test";

    private SuitTestUtils utils;

    @Before
    public void setUp() {
        utils = new SuitTestUtils(str);
    }

    @Test
    public void testPrintString() {
        utils.printString();
    }
}
