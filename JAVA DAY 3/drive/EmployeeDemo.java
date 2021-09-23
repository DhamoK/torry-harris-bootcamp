package com.torryharris.drive;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        /*Employee e1 = new Employee("SURYA","MANAGER",5001,59000.00);
        Employee e2 = new Employee("AATHI","DBA",5012,36000.00);
        Employee e3 = new Employee("HARI","QA",5003,31500.00);
        Employee e4 = new Employee("RAVI","TECHNICAL SUPPORT",5065,23000.00);*/
        Manager m1 = new Manager("RAVI SHANKAR","PROJECT MANAGER",5062,53500,"IOT",4);
        System.out.println(m1);
        m1.callMeeting();
        Clerk c1 = new Clerk("AARYA","CLERK1",5076,34500,"BE");
        System.out.println(c1);
        Lead l1 = new Lead("SIVA KUMAR","TECHNICAL LEAD",5097,45000,5);
        System.out.println(l1);
    }



}
