package com.example.zhaogaofei.junittest.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTestTest {
    private SimpleTest simpleTest;

    @Before
    public void setUp() throws Exception {
        simpleTest = new SimpleTest();
    }

    @Test
    public void plus() throws Exception {
        Assert.assertEquals(5, simpleTest.plus(2, 3), 0);
    }

    @Test
    public void less() throws Exception {
        Assert.assertEquals(2, simpleTest.less(6, 4), 0);
    }

    @Test
    public void multiply() throws Exception {
        Assert.assertEquals(6, simpleTest.multiply(2, 3), 0);
    }

    @Test
    public void except() throws Exception {
        Assert.assertEquals(3, simpleTest.except(6, 2), 2);
    }

}