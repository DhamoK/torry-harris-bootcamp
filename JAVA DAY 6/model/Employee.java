package com.torryharris.model;

public class Employee {
    private int empid,salary;
    private String name,designation;
    private int balanceCl;

    public Employee(int empid, int salary, String name, String designation) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
        balanceCl=12;
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

    public int getBalanceCl() {
        return balanceCl;
    }

    public void setBalanceCl(int balanceCl) {
        this.balanceCl = balanceCl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", balanceCl=" + balanceCl +
                '}';
    }
}
