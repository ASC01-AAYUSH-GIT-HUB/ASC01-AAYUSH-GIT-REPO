package com.lab.lab2.l2c1;

import java.io.Serializable;
import java.util.ArrayList;

public class NormMeet implements Serializable {
    public int meetid;
    public int maxperson;
    public String location;
    public String time;
    public String date;
//    public NormMeet(){
//        this.meetid=meetid;
//        this.maxperson=maxperson;
//        this.location=location;
//    }

    public static ArrayList<NormMeet> meetingroom=new ArrayList<>();
}
