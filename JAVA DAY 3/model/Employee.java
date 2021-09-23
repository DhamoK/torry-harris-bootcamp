package com.torryharris.model;

public class Employee {
    private String name,designation;
    private int empId;
    private double salary;

    public Employee() {
    }
    public Employee(String name, String designation, int empId, double salary) {
        this.name = name;
        this.designation = designation;
        this.empId = empId;
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "Employee Name is = " + name +  " \ndesignation = " + designation  +
                " \nempId = " + empId +
                " \nsalary is = " + salary +
                "";
    }
}
