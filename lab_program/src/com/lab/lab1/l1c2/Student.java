package com.lab.lab1.l1c2;
import com.lab.lab1.L1C1;

import java.util.ArrayList;

import static com.lab.lab1.L1C1.add;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable {
    int studId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarShip;
    public Student(int studId,String studentName,String city,int marks1,int marks2,int marks3,float feePerMonth,boolean isEligibleForScholarShip){
        this.studId=studId;
        this.studentName=studentName;
        this.city=city;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.feePerMonth=feePerMonth;
        this.isEligibleForScholarShip=isEligibleForScholarShip;
    }
    void getAnualFee(){
        System.out.println(12*feePerMonth);
    }
    int totalMarks(){
        return add(marks1,marks2,marks3);
    }
    void getAverage(){
        float avg= (float) add(marks1, marks2, marks3) /3;
        System.out.println(avg);
    }
    String getResult(){
        if(marks1>=60 && marks2>=60 && marks3>=60){
            return "Pass";
        }else{
            return "Fail";
        }
    }
    public static ArrayList<Student> students=new ArrayList<>();


}
