package com.lab.lab2.l2c1;

import java.io.Serializable;
import java.util.ArrayList;

public class ZoomMeet extends NormMeet implements Serializable {
    public int zoomAccID;
    public String devID;
//    public ZoomMeet(int zoomID,String devID,int meetid,int maxperson,String location){
//        super();
//        this.zoomID=zoomID;
//        this.devID=devID;
//        this.meetid=meetid;
//        this.location=location;
//        this.maxperson=maxperson;
//    }
    public  static ArrayList<ZoomMeet> onlineMeet=new ArrayList<>();

}
