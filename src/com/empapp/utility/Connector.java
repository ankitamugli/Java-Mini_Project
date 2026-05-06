package com.empapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection requestConnection() {
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root", "tiger");
           

        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Driver not found");
            e.printStackTrace();

        } 
  

        return con;
    }
}