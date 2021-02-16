package databaseConnection;

import java.sql.*;

public class ReadMysqlData {
    public static void main(String[] args) throws SQLException {
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mamun", "root", "root12345");

        Statement statement = conn.createStatement();

        String selectQuerey = "Select Id , First_Name, Last_Name, Email from Students";

        ResultSet rs = statement.executeQuery(selectQuerey);

        while(rs.next()){
            int id = rs.getInt("Id");

            String fname = rs.getString("First_Name");

            String lname = rs.getString("Last_Name");

            String email = rs.getString(3);

            System.out.println(id+" | "+fname+" | "+lname+" | "+email);
        }


        statement.close();
        conn.close();


        System.out.println("Query Executed....");
    }




}
