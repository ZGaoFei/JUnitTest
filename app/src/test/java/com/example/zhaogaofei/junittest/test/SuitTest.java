package com.example.zhaogaofei.junittest.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SuitOneTest.class, SuitTwoTest.class})
public class SuitTest {

    @Test
    public void test() {
        System.out.println("==========test=========");
    }

}
