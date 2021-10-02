package task.drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainDAO {
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Kddhamo@24";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");
            System.out.println();
            Statement statement = connection.createStatement();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
