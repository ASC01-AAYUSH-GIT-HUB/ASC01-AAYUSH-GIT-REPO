package com.lab.lab1.l1c2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.lab.lab1.l1c2.Student;

public class ClassRoom {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the number of students:");
        Scanner s=new Scanner(System.in);
        int no_stud=s.nextInt();
        s.nextLine();
        for (int i=0;i<no_stud;i++){
            System.out.println("Enter details of Student"+(i+1));
            System.out.print("Name:");
            String name=s.nextLine();
            System.out.print("ID:");
            int id=s.nextInt();
            s.nextLine();
            System.out.print("City:");
            String city=s.nextLine();
            System.out.println("Marks in three subjects in 3 line");
            int m1=s.nextInt();
            int m2=s.nextInt();
            int m3=s.nextInt();
            System.out.println("Fees for this student");
            float fee=s.nextFloat();
            s.nextLine();
            boolean scholarShip=false;
            Student stud=new Student(id,name,city,m1,m2,m3,fee,scholarShip);
            if (stud.totalMarks()>=280){
                stud.isEligibleForScholarShip=true;
            }

            Student.students.add(stud);
        }

        for (Student st: Student.students){
            String eli="No";
            if (st.isEligibleForScholarShip){
                eli="Yes";
            }else{
                eli="No";
            }
            System.out.println("NAME:"+st.studentName+"\nID"+st.studId+"\n Status:"+st.getResult()+"\n Eligible for Scholarship:"+eli+"\n\n");
        }
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("src/com/lab/lab1/l1c2/students.dat"));
        out.writeObject(Student.students);
        out.close();

    }
}
