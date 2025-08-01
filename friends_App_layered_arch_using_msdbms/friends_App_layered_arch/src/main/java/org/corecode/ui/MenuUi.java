package org.corecode.ui;

import org.corecode.model.Friend;
import org.corecode.service.ProductService;
import org.corecode.service.ProductServiceDBImpl;
import org.corecode.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class MenuUi {
    ProductService productService=new ProductServiceDBImpl();
    Scanner s=new Scanner(System.in);
    public void addfriend(){
        System.out.print("First Name: ");
        String fname=s.nextLine();
        System.out.print("Last Name: ");
        String lname=s.nextLine();
        System.out.print("Age: ");
        byte age=s.nextByte();
        s.nextLine();
        System.out.print("Phone Number: ");
        String phoneNo=s.nextLine();
        System.out.print("Email: ");
        String email=s.nextLine();

        Friend friend=new Friend(fname,lname,age,phoneNo,email);
        if(productService.addFriend(friend)){
            System.out.println("New friend is added in your friend group");
        }else{
            System.err.println("some error occurs while adding him/her in friend group");
        }
    }
    public void updateFriend(){
        System.out.println("Friend's present id:");
        String id=s.nextLine();
        System.out.println("Updated first name:");
        String firstname=s.nextLine();
        System.out.println("Updated last name:");
        String lastname=s.nextLine();
        System.out.println("Updated Age");
        byte age=s.nextByte();
        s.nextLine();
        System.out.println("Updated phone no.:");
        String phoneNo=s.nextLine();
        System.out.println("Updated email:");
        String email=s.nextLine();
        Friend friend=new Friend(firstname,lastname,age,phoneNo,email);
        friend.setFriendId(id);
        if(productService.updateFriend(friend)){
            System.out.println("Friend's detail is updated");
        }else{
            System.out.println("Friend's detail is not updated");
        }
    }
    public void displayAllfriends(){
        List<Friend> friends=productService.displayAllFriends();
        System.out.println("-----------------Friends------------------");
        for(Friend f:friends){
            System.out.println("Id: "+f.getFriendId()+"\nName: "+f.getFirstName()+" "+f.getLastName()+"\nAge: "+f.getAge()+"\nPhone No.: "+f.getPhoneNo()+"\nEmail: "+f.getEmail());
            System.out.println("------------------------------------------");
        }
    }
    public void deleteFriend(){
        System.out.println("Write the id of friend:");
        String id=s.nextLine();
        if (productService.deleteFriend(id)){
            System.out.println("That friend is removed");
        }else {
            System.out.println("Friend is not removed");
        }
    }

}
