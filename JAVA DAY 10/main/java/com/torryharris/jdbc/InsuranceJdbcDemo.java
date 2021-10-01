package com.torryharris.jdbc;

import com.torryharris.model.Employee;
import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJdbcDemo {
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

            //System.out.println("INSERTING 5 ATTRIBUTES");

            /*ArrayList<Insurance> insuranceList = getInsurance();
            for (Insurance i : insuranceList) {
                String insertQuery = "insert into insurance values ('" + i.getInsName() + "'," + i.getInsId() + "," + i.getSum() + ",'" + i.getInsType() + "')";
                System.out.println(insertQuery);
                statement.execute(insertQuery);
            }
            String query = "select * from insurance";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("INSURANCE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum= resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");


                Insurance insurance = new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }

            // Display ins_type = Term

            String query = "select * from insurance where ins_type = 'Term'";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("INSURANCE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum= resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");


                Insurance insurance = new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);

             //OrderBy SUM

            String query = "select * from insurance order by sum";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("INSURANCE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum= resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");


                Insurance insurance = new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);


            } //SUM greater than 3,00,000

            String query = "select * from where sum>300000";

            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("INSURANCE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum= resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");


                Insurance insurance = new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            */


            // Increasing Sum By 20 percentage

            String updateQuery = "update insurance set sum=sum+(sum*(20/100)) ";
            System.out.println(updateQuery);
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println("updated....");
            System.out.println("no of rows affected : "+rowsAffected);

            String query = "select * from insurance ";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("INSURANCE DETAILS : ");
            System.out.println("==============================================================================");

            while(resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum= resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");


                Insurance insurance = new Insurance(insName,insId,sum,insType);
                System.out.println(insurance);
            }
                System.out.println("Inserted.....");
                statement.close();
                connection.close();

            } catch(SQLException | ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }

    public static ArrayList<Insurance> getInsurance(){
        Insurance i1 = new Insurance("HDFC", 1021, 300000, "Health");
        Insurance i2 = new Insurance("IOB", 1026, 350000, "Term");
        Insurance i3 = new Insurance("BOI", 1028, 310000, "Health");
        Insurance i4 = new Insurance("KVB", 1023, 420000, "Life");
        Insurance i5 = new Insurance("AXIS", 1025, 450000, "Term");



        ArrayList<Insurance>insuranceArrayList = new ArrayList<>();
        insuranceArrayList.add(i1);
        insuranceArrayList.add(i2);
        insuranceArrayList.add(i3);
        insuranceArrayList.add(i4);
        insuranceArrayList.add(i5);

        return insuranceArrayList;

    }
}
