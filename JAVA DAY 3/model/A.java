package com.torryharris.model;

public class A {
    private int a;
    public static int value;

    public A() {
        // System.out.println("A class Default constructor");
    }

    public A(int a) {
        System.out.println("A class parameterized constructor");
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void display(){
        System.out.println("A's display method");
    }

    public static void staticMethod(){
        System.out.println("A's static Method");
    }
}
