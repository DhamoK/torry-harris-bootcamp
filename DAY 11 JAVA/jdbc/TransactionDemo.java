package com.torryharris.jdbc;

import java.sql.*;

public class TransactionDemo {
    static Connection connection;
    static Savepoint savepoint1;
    public static void main(String[] args) throws SQLException {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Kddhamo@24";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");
            System.out.println();


            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();

            String q1 = "update employee set salary = 23500 where empid=5002";

            statement.executeUpdate(q1);
            System.out.println("q1 updated\n");
            savepoint1=connection.setSavepoint("Checkpoint1");

            String q2 = "update employee set designation='Support' where empid=5002";

            statement.executeUpdate(q2);
            System.out.println("q2 updated\n");

            String q3 = "insert into employee values(5002,'SURESH','DBA',2019,45000)";
            statement.executeUpdate(q3);
            connection.commit();
            statement.close();
            connection.close();



        }catch (ClassNotFoundException|SQLException e){
            connection.rollback(savepoint1);
            System.out.println("ERROR!!!! ROLL BACKED");
            connection.commit();
            e.printStackTrace();
        }
    }

}
