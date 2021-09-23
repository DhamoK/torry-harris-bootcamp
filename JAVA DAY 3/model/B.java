package com.torryharris.model;

public class B extends A{
    private int b;

    public B() {
    }

    public B(int b) {
        this.b = b;
    }

    public B(int a, int b) {
        super(a);
        System.out.println("B class constructor");
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSuperClassA(){
        setA(b);
    }

    public void display(){
        System.out.println("B's display method");
    }

    public void anotherMethod(){
        System.out.println("Another Method just for Demo");
    }

    public static void staticMethod(){
        System.out.println("B's static method");
    }
}
