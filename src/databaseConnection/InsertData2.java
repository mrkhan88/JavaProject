package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData2 {

    public static void main(String[] args) {
        Connection conn = null;
        Statement statemnet = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mamun", "root", "root12345");

            statemnet =conn.createStatement();
            String updateContact = "Update Employees set contact = '45367494934' where id = '101'";
            statemnet.execute(updateContact);

        }catch (SQLException s){
            System.out.println("Connection Issue");
        }finally {
            try {
                statemnet.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }

        System.out.println("Query executed>>>>>>");



    }



}
