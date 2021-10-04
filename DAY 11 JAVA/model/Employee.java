package com.torryharris.model;

public class Employee {
    private int empId,yearOfJoining;
    private String name,designation;
    private double salary;

    public Employee(int empId, int yearOfJoining, String name, String designation, double salary) {
        this.empId = empId;
        this.yearOfJoining = yearOfJoining;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", yearOfJoining=" + yearOfJoining +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
