package com.torryharris.jdbc;

import com.torryharris.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeJdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Kddhamo@24";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");
            System.out.println();
            Statement statement = connection.createStatement();

            ArrayList<Employee>empList = getEmployees();
            insertUsingPreparedStatement(connection,empList);


            String query = "select * from employee";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("EMPLOYEE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                int empId = resultSet.getInt("empid");
                String name = resultSet.getString("name");
                String designation = resultSet.getString("designation");
                int yearofjoining = resultSet.getInt("yearofjoining");
                double salary = resultSet.getDouble("salary");


                Employee employee = new Employee(empId, yearofjoining,name, designation,salary);
                System.out.println(employee);
            }
            //==================================updating=================================================
            /*String updateQuery = "update employee " +
                    "set designation='Architect' " +
                    "where yearofjoining=2013";
            System.out.println(updateQuery);
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println("updated....");
            System.out.println("no of rows affected : "+rowsAffected);

            //inserting objects
            ArrayList<Employee>employeeList=getEmployees();
            for(Employee e:employeeList){
            String insertQuery = "insert into employee values(" + e.getEmpId() + ",'" + e.getName() + "','" + e.getDesignation() + "'," + e.getYearOfJoining() + "," + e.getSalary() + ")";
            System.out.println(insertQuery);
            statement.execute(insertQuery);
            }
            System.out.println("Inserted.....");
            statement.close();
            connection.close();*/

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
       public static ArrayList<Employee> getEmployees(){
            Employee e1 = new Employee(5007, 2012, "RAVI", "DBA", 25000);
            Employee e2 = new Employee(5008, 2013, "KUMAR", "QA", 32000);
            Employee e3 = new Employee(5009, 2017, "SANKAR", "SUPPORT", 20000);

            ArrayList<Employee>empList = new ArrayList<>();
            empList.add(e1);
            empList.add(e2);
            empList.add(e3);
            return empList;

        }

        public static void insertUsingPreparedStatement(Connection connection,ArrayList<Employee>empList) throws SQLException{

        String pQuery = "insert into employee values(?,?,?,?,?)";
        PreparedStatement pstat = connection.prepareStatement(pQuery);

        for(Employee employee : empList){
            pstat.setInt(1,employee.getEmpId());
            pstat.setString(2,employee.getName());
            pstat.setString(3,employee.getDesignation());
            pstat.setInt(4,employee.getYearOfJoining());
            pstat.setDouble(5,employee.getSalary());
            pstat.execute();
        }
        }


    }
