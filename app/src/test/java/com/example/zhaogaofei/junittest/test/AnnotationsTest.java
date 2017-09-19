package com.example.zhaogaofei.junittest.test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 使用BeforeClass和AfterClass修饰的必须是静态方法
 */
public class AnnotationsTest {
    private static final String TAG = "AnnotationsTest";

    @Before
    public void before() {
        System.out.println(TAG + "===before===");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println(TAG + "===beforeClass===");
    }

    @Test
    public void testOne() {
        System.out.println(TAG + "===testOne===");
    }

    @Test
    public void testTwo() {
        System.out.println(TAG + "===testTwo===");
    }

    @Ignore
    @Test
    public void testThree() {
        System.out.println(TAG + "===testThree===");
    }

    @After
    public void after() {
        System.out.println(TAG + "===after===");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(TAG + "===afterClass===");
    }

    @Ignore
    public void ignore() {
        System.out.println(TAG + "===ignore===");
    }
}
