package com.torryharris.model;

public class Lead extends Employee{
    int teamSize;

    public Lead(String name, String designation, int empId, double salary, int teamSize) {
        super(name, designation, empId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void standUpCall(){
        System.out.println("Standup call is planned at the end of week");
    }

    @Override
    public String toString() {
        return "Lead " + super.toString()+"\n"+
                "teamSize= " + teamSize +"\n"+
                "";
    }
}
