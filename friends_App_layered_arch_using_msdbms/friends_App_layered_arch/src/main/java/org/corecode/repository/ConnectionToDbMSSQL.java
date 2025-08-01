package org.corecode.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDbMSSQL {
    private static Connection connection;
    private ConnectionToDbMSSQL(){}
    public static Connection getConnection(){
        if(connection==null){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // Optional for JDBC 4.0+
                connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=Friends;user=sa;password=sqlserver;trustServerCertificate=true"
                );

                return connection;
            } catch (ClassNotFoundException | SQLException exception) {
                System.err.println(exception.getMessage());
            }
        }
        return connection;
    }
}
