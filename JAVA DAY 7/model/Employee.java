package com.torryharris.model;

public class Employee implements Comparable<Employee> {
     int empid,salary;
     String name,designation;

    public Employee(int empid, int salary, String name, String designation) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
    }
    @Override
    public int compareTo(Employee o) {
        return this.empid-o.empid;
    }
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "" +
                " empid =" + empid +"," +
                " salary =" + salary +"," +
                " name =" + name + "," +
                " designation =" + designation +
                "";
    }


}
