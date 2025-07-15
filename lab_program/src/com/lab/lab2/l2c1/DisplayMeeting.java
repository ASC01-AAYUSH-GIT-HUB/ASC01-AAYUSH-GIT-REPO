package com.lab.lab2.l2c1;
import com.lab.lab1.l1c2.Student;

import java.io.*;
import java.util.ArrayList;


public class DisplayMeeting {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1=new ObjectInputStream(new FileInputStream("src/com/lab/lab2/l2c1/normalMeeting.dat"));
        ArrayList<NormMeet> phyMeeting=new ArrayList<>();
        phyMeeting=(ArrayList<NormMeet>) in1.readObject();
        in1.close();

        ObjectInputStream in2=new ObjectInputStream(new FileInputStream("src/com/lab/lab2/l2c1/zoomMeeting.dat"));
        ArrayList<ZoomMeet> zoomMeeting=new ArrayList<>();
        zoomMeeting=(ArrayList<ZoomMeet>) in2.readObject();
        in2.close();
    }
}
