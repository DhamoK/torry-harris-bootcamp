package com.torryharris.drive;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        c = sc.nextInt();
        try {
            if (c == 0) {
                throw new ArithmeticException("Divided by Zero");
            } else {
                a = b / c;
            }
        }catch(ArithmeticException obj){
            System.out.println("Exception Caught:");
            System.out.println(obj);
        }
            System.out.println("HELLO");

        }
    }

