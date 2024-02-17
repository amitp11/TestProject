package com.company;

public class SubClass {

    private int a;
    protected int b;

    SubClass() {
        System.out.println("Initialized");
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
