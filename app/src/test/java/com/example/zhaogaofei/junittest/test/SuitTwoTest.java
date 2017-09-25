package com.example.zhaogaofei.junittest.test;


import org.junit.Before;
import org.junit.Test;

public class SuitTwoTest {

    private String str = "Suit Two Test";

    private SuitTestUtils utils;

    @Before
    public void setUp() {
        utils = new SuitTestUtils(str);
    }

    @Test
    public void testAddString() {
        utils.addString(" Hello world");
    }
}
