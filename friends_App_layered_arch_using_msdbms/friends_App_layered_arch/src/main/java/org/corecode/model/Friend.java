package org.corecode.model;

public class Friend {
    private String firstName;
    private String lastName;
    private byte age;
    private String phoneNo;
    private String email;
    private String friendId;

    public Friend(String firstName, String lastName, byte age, String phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFriendId() {
        return friendId;
    }
    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

}
