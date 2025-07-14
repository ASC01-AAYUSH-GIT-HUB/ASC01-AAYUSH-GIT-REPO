package com.lab.lab1;

import java.util.Scanner;

public class L1C3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("write the number whose table you want:");
        int num=s.nextInt();
        System.out.println("using for loop");
        for (int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
        System.out.println("using while loop");
        int i=1;
        while(i<=10){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
        }
        System.out.println("using do while loop");
        int j=1;
        do{
            System.out.println(num+"x"+j+"="+(num*j));
            j++;
        }while (j<=10);
    }
}
