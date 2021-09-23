package com.torryharris.drive;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        Integer iobj = a+b;//Boxing
        Integer jobj = a*b;
        Integer kobj = a/b;
        Integer lobj = a-b;
        System.out.println(iobj);
        System.out.println(jobj);
        System.out.println(kobj);
        System.out.println(lobj);
        System.out.println();
        int i = iobj;
        int j = jobj;
        int k = kobj;
        int l = lobj;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

//        int b = iobj;     //UnBoxing
//        System.out.println(iobj);
//        System.out.println(b);
//        Integer o2 = iobj + 10; //o2 is Integer object
//        System.out.println(o2);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the int values : ");
//        String intstr = sc.nextLine();
//        System.out.println("Enter the float values : ");
//        String fltstr = sc.nextLine();
//        int num = Integer.parseInt(intstr);
//        System.out.println(num*2);
//        float n = Float.parseFloat(fltstr);
//        System.out.println(n*2);

    }
}
