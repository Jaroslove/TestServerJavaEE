package ru.diplom.sample;


import java.sql.*;
import java.util.Properties;

/**
 * Created by 1 on 06.02.2017.
 */
public class Connector {
    Connection connection = null;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root";
    private final String USERPASS = "root";


    public String getConnection() {
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "root");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", properties);
            return "yse";
        } catch (SQLException e) {
            e.printStackTrace();
            return e.getMessage();


        }
    }
}