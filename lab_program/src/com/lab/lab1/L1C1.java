package com.lab.lab1;

public class L1C1 {
    public static void main(String[] args) {
        add(10,20);
        add((short)10,(short)30);
        add((byte)127,(byte)127);
        add("ram",40);
        add("Ear","th");
        System.out.println(add(3,30,300));
    }
    private static void add(int a,int b){
        System.out.println(a+b);
    }
    private static void add(byte a,byte b){
        System.out.println((byte)a+(byte)b);
    }
    public static int add(int a,int b,int c){
        int res=a+b+c;
//        System.out.println(res);
        return res;
    }
    private static void add(short a,short b){
        System.out.println((short)a+(short)b);
    }
    private static void add(String a,int b){
        String res=a+String.valueOf(b);
        System.out.println(res);
    }
    private static void add(String a,String b){
        System.out.println(a+b);
    }
}
