package com.lab.lab8;

import javax.script.ScriptContext;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Write the name of book:");
//        String bname=s.nextLine();
//        System.out.println("Writer's name:");
//        String aname=s.nextLine();
//        System.out.println("date of origin(book)(yyyy-mm-dd):");
//        String date=s.nextLine();
//        insertValue(bname,aname,date);
        displayValue();
    }
    public static void insertValue(String name,String authorname,String date){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://localhost:1433;databaseName=BooksDB;user=sa;password=sqlserver;trustServerCertificate=true";
            connection = DriverManager.getConnection(url);
            System.out.println("connection established!");

//            Statement statement=connection.createStatement();
//            System.out.println("Statement Created");
//            String sql="INSERT INTO Book (BookId, BookName, AuthorName, LaunchDate) VALUES (2, '1984', 'George Orwell', '1949-06-08');";
//            int rowUpdate= statement.executeUpdate(sql);
//            System.out.println("Number of rows updated: "+rowUpdate);
            String sql="insert into book (BookName, AuthorName, LaunchDate) values (?,?,?);";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,authorname);
            preparedStatement.setDate(3,Date.valueOf(date));
            int lineupdate= preparedStatement.executeUpdate();
            System.out.println("lines update:"+ lineupdate);
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println(classNotFoundException);
        } catch (SQLException sqlException) {
            System.err.println(sqlException);
        } finally {
            try {
                if(connection!=null && !connection.isClosed()){
                    connection.close();
                    System.out.println("Connection is closed");
                }
            } catch (Exception exception) {
                System.err.println(exception);
                // TODO: handle exception
            }
        }
    }
    public static void displayValue(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        Scanner s=new Scanner(System.in);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://localhost:1433;databaseName=BooksDB;user=sa;password=sqlserver;trustServerCertificate=true";
            connection = DriverManager.getConnection(url);
            System.out.println("connection established!");

//            Statement statement=connection.createStatement();
//            System.out.println("Statement Created");
//            String sql="INSERT INTO Book (BookId, BookName, AuthorName, LaunchDate) VALUES (2, '1984', 'George Orwell', '1949-06-08');";
//            int rowUpdate= statement.executeUpdate(sql);
//            System.out.println("Number of rows updated: "+rowUpdate);


//            String sql="insert into book (BookName, AuthorName, LaunchDate) values (?,?,?);";
//            preparedStatement=connection.prepareStatement(sql);
//            preparedStatement.setString(1,name);
//            preparedStatement.setString(2,authorname);
//            preparedStatement.setDate(3,Date.valueOf(date));
//            int lineupdate= preparedStatement.executeUpdate();
//            System.out.println("lines update:"+ lineupdate);

            Statement statement=connection.createStatement();
            System.out.println("Statement Created");
            String sql="select * from book";
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                int id=resultSet.getInt("BookId");
                String bname=resultSet.getString("BookName");
                String aname=resultSet.getString("AuthorName");
                String date=resultSet.getString("LaunchDate");
                System.out.println(id+" "+bname+" "+aname+" "+date);

            }

        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println(classNotFoundException);
        } catch (SQLException sqlException) {
            System.err.println(sqlException);
        } finally {
            try {
                if(connection!=null && !connection.isClosed()){
                    connection.close();
                    System.out.println("Connection is closed");
                }
            } catch (Exception exception) {
                System.err.println(exception);
//                 TODO: handle exception
            }
        }
    }
}
