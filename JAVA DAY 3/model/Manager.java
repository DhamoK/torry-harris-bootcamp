package com.torryharris.model;

public class Manager extends Employee {
    String projectName;
    int noOfTeams;

    public Manager(String name, String designation, int empId, double salary, String projectName, int noOfTeams) {
        super(name, designation, empId, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;
    }
    public void callMeeting(){
        System.out.println("Manager "+getName()+" started......");
        System.out.println();
        System.out.println("-----------------------------------------------");
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    @Override
    public String toString() {
        return "Manager \n" + super.toString()+
                "\nprojectName= " + projectName +
                "\nnoOfTeams= " + noOfTeams +"\n"+
                "";
    }
}
