package com.torryharris.drive;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class PersonListDemo {
    public static void main(String[] args) {

        Person p1 = new Person(872234571812L, "KARTHIK", "TAMILNADU", "DBA");
        Person p2 = new Person(872234571820L, "RAMESH", "KARNATAKA", "QA");
        Person p3 = new Person(872234571813L, "SURESH", "ASSAM", "LEAD");
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(p1);
        personArrayList.add(p2);
        personArrayList.add(p3);

        System.out.println("====================== AFTER SORTING ===================");
        personArrayList.sort(null);
        Iterator<Person> employeeIt = personArrayList.iterator();
        while (employeeIt.hasNext()) {
            System.out.println(employeeIt.next());

        }
        System.out.println();
        System.out.println("====================== SORTING IN REVERSE ORDER ===================");
        personArrayList.sort(Collections.reverseOrder());
        Iterator<Person> employeeIterator2 = personArrayList.iterator();
        while (employeeIterator2.hasNext()) {
            System.out.println(employeeIterator2.next());
        }
    }
}