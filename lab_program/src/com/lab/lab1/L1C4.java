package com.lab.lab1;

import java.util.Scanner;

public class L1C4 {
    public static void main(String[] args) {
        boolean start=true;
        int count=0;
        boolean num=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Write a sentence:");
        String line=s.nextLine();
//        System.out.println(line);
        int len=line.length();
        for(char c: line.toCharArray()){
            if (c==' ' && !num){
                count++;
                start=true;
            }
            else if(c==' '){
                num=false;
                start=true;
            }
            else if(c!=' '){
                start=false;
                if (c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'){
                    num=true;
                }
            }
        }
        if (!num&&!start){
            count++;
        }
        System.out.println(count);
    }
}
