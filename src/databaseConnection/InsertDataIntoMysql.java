package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataIntoMysql {

    public static void main(String[] args) throws SQLException {
        //Create Connection using DriverManager class and reference to Connection class
        //Create statement
        //Wrirte query and Execute query
        //close Statement
        //Close connection

        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mamun", "root", "root12345");

        Statement stm = conn.createStatement();

//        String insertquery = "insert into employees values(101,'Robin','Hood','NY')";
        String alter ="alter table Employees add contact varchar (40) after State";
//        stm.execute(insertquery);
//        stm.execute(alter);

        //to update column
        String update = "update Students set contact ='76746722' where id = '104'";
        stm.execute(update);

        stm.close();
        conn.close();

        System.out.println("Query was Executed Successfull.");



    }




}
