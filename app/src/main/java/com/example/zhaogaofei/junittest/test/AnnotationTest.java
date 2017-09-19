package com.example.zhaogaofei.junittest.test;


public class AnnotationTest {

    private static final String TAG = "AnnotationsTest";

    public void before() {
//        Log.e(TAG, "===before===");
        System.out.println(TAG + "===before===");
    }

    public void beforeClass() {
//        Log.e(TAG, "===beforeClass===");
        System.out.println(TAG + "===beforeClass===");
    }

    public void testOne() {
//        Log.e(TAG, "===testOne===");
        System.out.println(TAG + "===testOne===");
    }

    public void testTwo() {
//        Log.e(TAG, "===testTwo===");
        System.out.println(TAG + "===testTwo===");
    }

    public void after() {
//        Log.e(TAG, "===after===");
        System.out.println(TAG + "===after===");
    }

    public void afterClass() {
//        Log.e(TAG, "===afterClass===");
        System.out.println(TAG + "===afterClass===");
    }

    public void ignore() {
//        Log.e(TAG, "===ignore===");
        System.out.println(TAG + "===ignore===");
    }
}
