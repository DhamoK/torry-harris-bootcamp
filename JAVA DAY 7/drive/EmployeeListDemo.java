package com.torryharris.drive;

import com.torryharris.comparator.EmployeeComparatorName;
import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeListDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4566, 25000, "RAVI", "DBA");
        Employee emp2 = new Employee(4567, 32000, "SHIVU", "QA");
        Employee emp3 = new Employee(4570, 30000, "BALA", "LEAD");



        ArrayList<Employee> empArrayList = new ArrayList<>();
        empArrayList.add(emp1);
        empArrayList.add(emp2);
        empArrayList.add(emp3);
        //System.out.println("===========================================================");
        //TO DISPLAY ONE BY ONE
        //System.out.println(empArrayList);
        //System.out.println("========================TO DISPLAY ONE BY ONE=================");

        for (int i = 0; i < empArrayList.size(); i++) {
            //System.out.println(empArrayList.get(i));
        }
        for (Employee e : empArrayList) {
            //System.out.println(e);
        }
        System.out.println("======================Object Class===================");
        ArrayList<Object> iobj = new ArrayList<>();
        iobj.add(5);
        iobj.add(emp1);
        iobj.add(2.45f);
        for (Object e : iobj) {
            System.out.println(e);

        }
        System.out.println("====================== USING ITERATOR ===================");
        Iterator<Employee> employeeIterator = empArrayList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
        System.out.println();

        System.out.println("====================== AFTER SORTING ===================");
        empArrayList.sort(null);
        Iterator<Employee> employeeIt = empArrayList.iterator();
        while (employeeIt.hasNext()) {
            System.out.println(employeeIt.next());
       }
        System.out.println("=============AFTER SORTING IN REVERSE ORDER =============");
        empArrayList.sort(Collections.reverseOrder());
        Iterator<Employee> employeeIterator1 = empArrayList.iterator();
        while (employeeIterator1.hasNext()) {
            System.out.println(employeeIterator1.next());
        }
        System.out.println();
        System.out.println("============ USING THIRD PARTY COMPARATOR ================");
        empArrayList.sort(new EmployeeComparatorName());
        Iterator<Employee> employeeIterator3 = empArrayList.iterator();
        while (employeeIterator3.hasNext()) {
            System.out.println(employeeIterator3.next());
        }

    }
}
