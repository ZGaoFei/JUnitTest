package com.example.zhaogaofei.junittest.test;


public class SuitTestUtils {

    private String str = "Suit Test Utils";

    public SuitTestUtils(String str) {
        this.str = str;
    }

    public String addString(String a) {
        str = str + a;
        System.out.println(str);
        return str;
    }

    public String printString() {
        System.out.println(str);
        return str;
    }

}
