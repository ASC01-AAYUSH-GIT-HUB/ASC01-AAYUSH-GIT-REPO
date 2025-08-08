package org.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEES")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //we genneraly use wrapper types instead of primitive types
    //to allow null values in the database
    //we use Long instead of long to allow null values
    // in the database, as long cannot be null
    @Column(name= "FIRST_NAME",nullable = false)
    private String firstname;
    @Column(name = "LAST_NAME",nullable = false)
    private String lastname;
    @Column(name = "EMAIL",nullable = false)
    private String email;

    public EmployeeEntity(){
    }
    public EmployeeEntity(String firstname, String lastname, long id, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

