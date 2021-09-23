package com.torryharris.drive;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
        String s = null;
        System.out.println(s.length()); //NullPointerException

        int[] array = new int[4];
        array[5] = 34;
        System.out.println(array[5]);

        int a =5,b=0;
        int c = a/b;//ArithmeticException
        System.out.println(c);

    }catch(NullPointerException ex){
            ex.printStackTrace();
        }
        System.out.println("hello");
    }

}
