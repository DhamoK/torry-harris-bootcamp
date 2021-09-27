package com.torryharris.model;

import com.torryharris.exception.ClLimitExceededException;
import com.torryharris.exception.InvalidClRequestException;

import java.io.InvalidClassException;

public class HrDept {
    private int balance = 0;
    private Employee emp;

    public HrDept( int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void requestCl(Employee emp,int noOfDays) throws InvalidClRequestException, ClLimitExceededException {
        if(noOfDays>3){
            throw new InvalidClRequestException(emp.getName() + "InvalidCl Request");
        }

        if(emp.getBalanceCl()<noOfDays){
            throw new ClLimitExceededException(emp.getName() +" Cl Limit Exceeds");
        }else{
            System.out.println(emp.getName()+" Cl Approved and balance leave is :  "+ balance +"\n"+ "Total Cl Leaves valid "+ emp.getBalanceCl()+
            "\n"+ "leave Taken : " + noOfDays);
        }
    }
}
