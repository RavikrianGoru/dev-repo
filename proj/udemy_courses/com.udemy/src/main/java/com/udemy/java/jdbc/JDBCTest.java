package com.udemy.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest
{

    /*
     * 
     * download: mysql, download: mysql workbench download: mysql connector
     * 
     * Drive muste be added in classpath
     */
    public static void main(String[] args) throws SQLException
    {
        // Establish Connection
        Connection conn = DriverManager.getConnection("URL", "user", "password");

        // Create Statement
        Statement stmt = conn.createStatement();
        // conn.prepareStatement("");
        // conn.prepareCall("");

        // Execute query and get results
        ResultSet rSet = stmt.executeQuery("select * from emp");
        // stmt.executeUpdate("");
        
        while (rSet.next())
        {
            System.out.println(rSet.getString("ename"));
        }
    }

}
