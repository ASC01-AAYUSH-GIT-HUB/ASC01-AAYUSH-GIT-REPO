package com.lab.lab2.l2c1;

import com.lab.lab1.l1c2.Student;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("want to create a meeting y/n");
            String q=s.nextLine();
            if(Objects.equals(q, "y")){
                System.out.println("Enter employee details Name then ID");
                MeetingSchedule m1 =new MeetingSchedule();
//        s.nextLine();
                System.out.println("Want meeting on zoom y/n:");
                String dis=s.nextLine();
                if(Objects.equals(dis, "y")){
                    m1.onZoom=true;
                }
                else{
                    m1.onZoom=false;
                }
                m1.createMeeting();
            }else{
                break;
            }
        }while(true);
        System.out.println("Room meeting details List:");
        for(NormMeet nm: NormMeet.meetingroom){
            System.out.println("Place:"+nm.location+"\nMeet ID:"+nm.meetid+"\nDate:"+nm.date+"\nTime:"+nm.time);
            System.out.println("------------------------------");
        }
        System.out.println("Zoom meeting details List:");
        for(ZoomMeet zm: ZoomMeet.onlineMeet){
            System.out.println(zm.meetid+"\n"+zm.zoomAccID+"\n"+zm.devID+"\n"+zm.date+"\n"+zm.time);
            System.out.println("------------------------------");
        }
        ObjectOutputStream out1=new ObjectOutputStream(Files.newOutputStream(Paths.get("src/com/lab/lab2/l2c1/normalMeeting.dat")));
        out1.writeObject(NormMeet.meetingroom);
        out1.close();
        ObjectOutputStream out2=new ObjectOutputStream(Files.newOutputStream(Paths.get("src/com/lab/lab2/l2c1/zoomMeeting.dat")));
        out2.writeObject(ZoomMeet.onlineMeet);
        out2.close();

    }
}
