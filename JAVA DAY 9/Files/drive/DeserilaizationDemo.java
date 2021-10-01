package Files.drive;

import Files.model.Employee;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserilaizationDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream("employees.txt");
        ObjectInputStream employeeInputStream = new ObjectInputStream(fis);
        ArrayList<Employee>employeeArrayList = new ArrayList<>();
        Employee employee;
        System.out.println("Employee details from the file are:  ");
        try{
            while(true){
                employee = (Employee) employeeInputStream.readObject();
                employeeArrayList.add(employee);
            }

        }catch (EOFException e){

        }
        for(Employee emp:employeeArrayList){
            System.out.println(emp);
        }
    }
}
