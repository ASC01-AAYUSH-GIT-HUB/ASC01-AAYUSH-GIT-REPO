package com.lab.lab1.l1c2;

import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class DisplayRoom {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/com/lab/lab1/l1c2/students.dat"));

        Student.students=(ArrayList<Student>) in.readObject();
        in.close();
        for (Student st: Student.students){
            String eli;
            if (st.isEligibleForScholarShip){
                eli="Yes";
            }else{
                eli="No";
            }
            System.out.println("NAME:"+st.studentName+"\nID:"+st.studId+"\nStatus:"+st.getResult()+"\nEligible for Scholarship:"+eli+"\n\n");
        }
    }

}
