package com.ddo.section06.singleton;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;

        System.out.println("nonStaticMethod 호출됨...");

    }

    public static void staticMethod() {
//        this.count++;

        System.out.println("staticMethod 호출됨...");
    }
}