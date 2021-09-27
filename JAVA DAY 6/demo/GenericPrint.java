//Generic Type
package com.torryharris.demo;

import com.torryharris.model.Employee;
import com.torryharris.model.GenericType;

public class GenericPrint {
    public static void main(String[] args) {
        GenericType<Integer, Float> iprint = new GenericType<>(10, 9.2f);
        System.out.println(iprint.getObj() + " " + iprint.gets());
        GenericType<Double, Boolean> dprint = new GenericType<>(2.34556, true);
        System.out.println(dprint.getObj() + " " + dprint.gets());
        GenericType<String, Character> sprint = new GenericType<>("DHAMO", 'c');
        System.out.println(sprint.getObj() + " " + sprint.gets());
        Employee emp = new Employee(4566, 25000, "RAVI", "DBA");
        GenericType<Employee, Double> emprint = new GenericType<>(emp, 3.45567);
        System.out.println(emprint.getObj() + " " + dprint.gets());

        genericdisplay(10);
        genericdisplay("DHAMO");
    }
    static <T> void genericdisplay(T obj) {
        System.out.println(obj);
    }
}
