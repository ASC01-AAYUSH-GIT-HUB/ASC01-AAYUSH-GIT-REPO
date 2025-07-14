package com.lab.lab1;

import java.util.*;
import java.util.stream.Collectors;

public class L1C6 {
//    static char star;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println(star);
        System.out.println("Write number of items in array");
        int len=s.nextInt();

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        int[] a= new int[len];
        System.out.println("enter value in array:");
        for(int i=0;i<len;i++){
            int temp=s.nextInt();
            a[i]=temp;
        }
        System.out.println("the array:");
        display(a);
        System.out.println("do you want to make array dynamic 1 for yes and any integer for no");
        if (s.nextInt()==1){
            arrayList=dynamic(a);

//            for(int i: arrayList){
//                System.out.print(i+" ");
//            }
        }
        System.out.println("removing duplicates");
        arrayList=removecopy(a);


//        sort(a);
//        System.out.println("Sorted array:");
//        display(a);

//        System.out.println("write the number whose count you want in array:");
//        int num=s.nextInt();
//        count(a,num);

//        ArrayList<Integer> numbers=new ArrayList<>();

    }

    public static void display(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void count(int[] a,int num){
        int count=0;
        for(int i: a){
            if (i==num){
                count++;
            }
        }
        System.out.println(count);
    }
    public static ArrayList<Integer> dynamic(int[] a){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i: a){
            arrayList.add(i);
        }
        boolean loop=true;
        do{
            System.out.println("want to add or remove integer from list.if add 1,remove 2,else any int");
            int val=s.nextInt();
            switch (val){
                case 1:
                    System.out.println("enter the number and possision where you want to add:");
                    int num=s.nextInt();
                    int place=s.nextInt();
                    try{
                        arrayList.add(place-1,num);
                    } catch (Exception e) {
                        System.out.println(e+"place the correct value for place");
                    }
                    break;
                case 2:
                    System.out.println("write the place of integer which you want to remove");
                    int plac=s.nextInt();
                    try{
                        arrayList.remove(plac);
                    }catch (Exception e){
                        System.out.println(e+"enter correct place");
                    }
                    break;
                default:
                    System.out.println(arrayList);
                    loop=false;
                    break;
            }
        }while(loop);

        return arrayList;
    }
    public static ArrayList<Integer> removecopy(int[] a){
        Set<Integer> st= Arrays.stream(a).boxed().collect(Collectors.toSet());
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(st);
        System.out.println(arr);
        return  arr;
    }
}
