package com.torryharris.drive;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> ilist=new ArrayList<>();
        ilist.add(20);
        ilist.add(500);
        //System.out.println(ilist);
        ArrayList<String> slist=new ArrayList<>();
        slist.add("DHAMO");
        slist.add("THARAN");
        //System.out.println(slist);



        Employee emp1 = new Employee(4566, 25000, "RAVI", "DBA");
        Employee emp2 = new Employee(4567, 32000, "SHIVU", "QA");
        Employee emp3 = new Employee(4570, 30000, "BALA", "LEAD");


        ArrayList<Employee>empArrayList = new ArrayList<>();
        empArrayList.add(emp1);
        empArrayList.add(emp2);
        empArrayList.add(emp3);
        System.out.println("===========================================================");
        //TO DISPLAY ONE BY ONE
        //System.out.println(empArrayList);
        System.out.println("========================TO DISPLAY ONE BY ONE=================");

        for(int i=0;i<empArrayList.size();i++){
            //System.out.println(empArrayList.get(i));
        }
        for (Employee e:empArrayList){
            //System.out.println(e);
        }
        System.out.println("======================Object Class===================");
        ArrayList<Object> iobj = new ArrayList<>();
        iobj.add(5);
        iobj.add(emp1);
        iobj.add(2.45f);
        for (Object e:iobj){
            System.out.println(e);

        }
        System.out.println("====================== USING ITERATOR ===================");
        Iterator<Employee>employeeIterator= empArrayList.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }
    }
}

