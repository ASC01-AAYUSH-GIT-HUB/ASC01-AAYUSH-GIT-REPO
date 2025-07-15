package com.lab.lab2.l2c1;

import java.util.ArrayList;
import java.util.Scanner;

public class MeetingSchedule {
    Scanner s=new Scanner(System.in);
    String name=s.nextLine();
    int id=s.nextInt();
    EmployeeDetail employeeDetail=new EmployeeDetail(id, name);
    boolean onZoom;

    public void createMeeting(){
        if(onZoom){
            ZoomMeet zm=new ZoomMeet();
            System.out.println("Enter person limit");
            zm.maxperson=s.nextInt();
            s.nextLine();
            System.out.println("Location");
            zm.location=s.nextLine();
            System.out.println("Enter meeting ID(in number)");
            zm.meetid=s.nextInt();
            s.nextLine();
            System.out.println("Enter device ID");
            zm.devID=s.nextLine();
            System.out.println("Enter Zoom Account ID(in number)");
            zm.zoomAccID=s.nextInt();
            s.nextLine();
            System.out.print("Time:");
            zm.time=s.nextLine();
            System.out.print("Date:");
            zm.date=s.nextLine();
            ZoomMeet.onlineMeet.add(zm);
        }else{
            NormMeet zm=new NormMeet();
            System.out.println("Enter meet id(in Number):");
            zm.meetid=s.nextInt();
            System.out.println("Enter person limit");
            zm.maxperson=s.nextInt();
            s.nextLine();
            System.out.println("Enter Location");
            zm.location=s.nextLine();
            System.out.print("Time:");
            zm.time=s.nextLine();
            System.out.print("Date:");
            zm.date=s.nextLine();
            NormMeet.meetingroom.add(zm);
        }
    }

}
