package com.torryharris.drive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list1=new LinkedList<>();
        list1.add("DHAMO");
        list1.add("THARAN");
        System.out.println(list1);

        String[]names = {"NIKKI","SURESH","BALA"};
        list1.addAll(Arrays.asList(names));
        System.out.println(list1);

        System.out.println("===========STACK INTEGER==========");

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(19);
        integerStack.push(6);
        integerStack.push(5);
        integerStack.push(1);


        System.out.println(integerStack.peek());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());

    }
}
