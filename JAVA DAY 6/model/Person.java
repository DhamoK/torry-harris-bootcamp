package com.torryharris.model;

import com.torryharris.exception.InsufficentFundsException;
import com.torryharris.exception.WithdrawlLimitExceededException;

public class Person {
    private String name;
    private int accNum,balance,totalAmountWithdrawn;
    private int dailyWithdrawnLimit;

    public Person(String name, int accNum, int balance, int totalAmountWithdrawn, int dailyWithdrawnLimit) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
        this.totalAmountWithdrawn = totalAmountWithdrawn;
        this.dailyWithdrawnLimit = dailyWithdrawnLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalAmountWithdrawn() {
        return totalAmountWithdrawn;
    }

    public void setTotalAmountWithdrawn(int totalAmountWithdrawn) {
        this.totalAmountWithdrawn = totalAmountWithdrawn;
    }

    public int getDailyWithdrawnLimit() {
        return dailyWithdrawnLimit;
    }

    public void setDailyWithdrawnLimit(int dailyWithdrawnLimit) {
        this.dailyWithdrawnLimit = dailyWithdrawnLimit;
    }
    public void withdrawAmount(int amount) throws WithdrawlLimitExceededException, InsufficentFundsException {
        if (amount>balance){
            throw new InsufficentFundsException("Insufficient fund !! your balance is :"+balance);
        }
        if(totalAmountWithdrawn+amount > dailyWithdrawnLimit){
            throw new WithdrawlLimitExceededException("Withdrawl limit Exceeded:\n"+
                    "total amount withdrawn today is: Rs."+totalAmountWithdrawn);
        }
        balance-=amount;
        totalAmountWithdrawn+=amount;
        System.out.println("Amount withdrawl for Rs "+amount+" is success !!");
        System.out.println("Balance is : "+balance);
        System.out.println("Total Amount Withdrawn is : "+totalAmountWithdrawn);
        System.out.println();

    }
}
