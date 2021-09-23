package com.torryharris.model;

public class Clerk extends Employee{
    String degree;

    public Clerk(String name, String designation, int empId, double salary, String degree) {
        super(name, designation, empId, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void generatePayRoll(){
        System.out.println("Salary Structure is yet to be released soon...");
    }

    @Override
    public String toString() {
        return "Clerk " + super.toString() +"\n"+
                "degree= " + degree +"\n"+
                "";
    }
}
