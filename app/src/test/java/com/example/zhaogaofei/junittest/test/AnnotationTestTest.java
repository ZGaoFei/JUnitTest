package com.example.zhaogaofei.junittest.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTestTest {
    private static AnnotationTest annotationTest;

    @BeforeClass
    public static void beforeClass() throws Exception {
        annotationTest.beforeClass();
    }

    @BeforeClass
    public static void setUp() throws Exception {
        annotationTest = new AnnotationTest();
        System.out.println("===setUp===");
    }

    @Before
    public void before() throws Exception {
        annotationTest.before();
    }

    @Test
    public void testOne() throws Exception {
        annotationTest.testOne();
    }

    @Test
    public void testTwo() throws Exception {
        annotationTest.testTwo();
    }

    @After
    public void after() throws Exception {
        annotationTest.after();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        annotationTest.afterClass();
    }

    @Ignore
    public void ignore() throws Exception {
        annotationTest.ignore();
    }

}