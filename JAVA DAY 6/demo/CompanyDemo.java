package com.torryharris.demo;

import com.torryharris.exception.ClLimitExceededException;
import com.torryharris.exception.InvalidClRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.HrDept;

public class CompanyDemo {
    public static void main(String[] args) {

        Employee emp = new Employee(4566,25000,"RAVI","DBA");
        HrDept hr = new HrDept(0);
        try{
            hr.requestCl(emp,2);
        }catch
        (ClLimitExceededException ex){
            System.err.println(ex);
        }catch(InvalidClRequestException ex){
            System.err.println(ex);
        }
        finally {
            System.out.println("good bye");
        }
    }
}
