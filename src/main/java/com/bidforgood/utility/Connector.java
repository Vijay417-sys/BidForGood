package com.bidforgood.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static final String URL = "jdbc:mysql://localhost:3306/bidforgood_db";
    private static final String USER = "root";
    private static final String PASSWORD = "your_mysql_password"; // <-- CHANGE THIS!

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection c = getConnection();
        if (c != null) System.out.println("TEST PASSED");
        else System.out.println("TEST FAILED");
    }
}