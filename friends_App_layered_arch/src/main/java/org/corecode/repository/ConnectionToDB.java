package org.corecode.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
    private static Connection connection;
    private ConnectionToDB(){}
    public static Connection getConnection(){
        if(connection==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/friends","root","mysql");
                return connection;
            } catch (ClassNotFoundException | SQLException exception) {
                System.err.println(exception.getMessage());
            }
        }
        return connection;
    }
}
