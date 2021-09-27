package com.torryharris.demo;

import com.torryharris.exception.WithdrawlLimitExceededException;
import com.torryharris.exception.InsufficentFundsException;
import com.torryharris.model.Person;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Person shivu = new Person("SHIVU", 986342524, 65000, 0, 25000);
            try {
                shivu.withdrawAmount(5000);
                shivu.withdrawAmount(10000);
                shivu.withdrawAmount(34000);
            }catch(
            WithdrawlLimitExceededException ex){
                System.err.println(ex);
            }catch(InsufficentFundsException ex){
                System.err.println(ex);
            }finally{
                System.out.println("The end of the code");
            }
        }
    }

