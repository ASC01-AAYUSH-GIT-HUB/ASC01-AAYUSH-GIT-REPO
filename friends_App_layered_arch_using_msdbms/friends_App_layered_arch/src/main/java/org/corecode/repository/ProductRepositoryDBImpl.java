package org.corecode.repository;

import org.corecode.model.Friend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepositoryDBImpl implements ProductRepository{
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Override
    public boolean addFriend(Friend friend) {
        try{
            connection= ConnectionToDbMySQL.getConnection();
            System.out.println("Driver Connected");
            statement=connection.createStatement();
            System.out.println("Statement Created");
            resultSet=statement.executeQuery("SELECT MAX(ID) FROM MYFRIENDS;");
            resultSet.next();
            String friendid= resultSet.getString(1);
            int count=Integer.parseInt(friendid.substring(1,4))+1;
            String fid=Integer.toString(count);
            String str="";
            for(int i = 0;i<3-fid.length() ; i++){
                str=str+"0";
            }
            fid="F"+str+fid;
            friend.setFriendId(fid);
            String firstName= friend.getFirstName();
            String lastName= friend.getLastName();
            byte age= friend.getAge();
            String phoneNo= friend.getPhoneNo();
            String email= friend.getEmail();
            String query="INSERT INTO myfriends(id,firstname,lastname,age,phone,email) VALUES('"+fid+"','"+firstName+"','"+lastName+"',"+Byte.toString(age)+",'"+phoneNo+"','"+email+"');";
            int rowsEffected= statement.executeUpdate(query);
            System.out.println(rowsEffected+" row added to Data Base");
            return rowsEffected>0;


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public List<Friend> displayallFriend() {
        List<Friend> friends=new ArrayList<>();
        try {
            connection= ConnectionToDbMySQL.getConnection();
            statement=connection.createStatement();
            String  query="SELECT * FROM myfriends";
            resultSet= statement.executeQuery(query);
            while (resultSet.next()){
                String firstname=resultSet.getString("firstname");
                String lastname=resultSet.getString("lastname");
                byte age=resultSet.getByte("age");
                String phoneNo=resultSet.getString("phone");
                String email=resultSet.getString("email");
                String id=resultSet.getString(1);
                Friend f=new Friend(firstname,lastname,age,phoneNo,email);
                f.setFriendId(id);
                friends.add(f);
            }
//        return Collections.emptyList();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
        return friends;
    }

    @Override
    public boolean updateFriend(Friend friend) {
        try{
            connection= ConnectionToDbMySQL.getConnection();
            statement= connection.createStatement();
            String query="UPDATE myfriends set firstname='"+friend.getFirstName()+"', lastname='"+friend.getLastName()+"', age="+Byte.toString(friend.getAge())+",phone='"+friend.getPhoneNo()+"',email='"+friend.getEmail()+"' where id='"+friend.getFriendId()+"';";
            int effected= statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteFriend(String id) {
        try{
            connection= ConnectionToDbMySQL.getConnection();
            statement= connection.createStatement();
            String query="DELETE FROM myfriends WHERE ID='"+id+"';";
            int effectedRows=statement.executeUpdate(query);
            return effectedRows>0;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
