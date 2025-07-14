package com.lab.lab1;

public class L1C5 {
    public static void main(String[] args) {
        String line="I am a good guy and I love java";
        String line1="i am a good guy and i love java";
        String line2="I am a good guy and I love java";
        System.out.println(line.charAt(4));
        System.out.println(line.contains("y"));
        System.out.println(line.length());
        System.out.println(line.indexOf("g"));
        System.out.println(line.toLowerCase());
        System.out.println(line.toUpperCase());
        System.out.println(line.equals(line1));
        System.out.println(line.equals(line2));
        System.out.println(line.equalsIgnoreCase(line1));
        System.out.println(line.equalsIgnoreCase(line2));
        String[] texts={"hehehehe","hahahaha","hohohoho"};
        String laugh=String.join(" ",texts);
        System.out.println(laugh);
        System.out.println(line.lastIndexOf("g"));
        System.out.println(line.lastIndexOf("d "));
        System.out.println(line.substring(21));
        System.out.println(line.substring(4,15));
        String word="   good life   ";
        System.out.println(word.trim());
    }
}
