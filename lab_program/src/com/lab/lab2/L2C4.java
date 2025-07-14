package com.lab.lab2;

import java.util.Scanner;

public class L2C4 {
    public static void main(String[] args) {
        System.out.println("Write a number:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        String nums="";
        int rem;
        while(num!=0){
            rem=num%10;
            num=num/10;
            switch (rem){
                case 1:
                    nums="One "+nums;
                    break;
                case 2:
                    nums="Two "+nums;
                    break;
                case 3:
                    nums="Three "+nums;
                    break;
                case 4:
                    nums="Four "+nums;
                    break;
                case 5:
                    nums="Five "+nums;
                    break;
                case 6:
                    nums="Six "+nums;
                    break;
                case 7:
                    nums="Seven "+nums;
                    break;
                case 8:
                    nums="Eight "+nums;
                    break;
                case 9:
                    nums="Nine "+nums;
                    break;
                case 0:
                    nums="Zero "+nums;
                    break;
            }

        }
        nums.trim();
        System.out.println(nums);
    }
}
