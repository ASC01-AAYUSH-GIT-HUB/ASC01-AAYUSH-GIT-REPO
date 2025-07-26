package com.lab.lab3;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

    String movie_name;
    String produced_by;
    String directed_by;
    String duration;
    String year;
    String category;
    static int count_Movie;
    String movie_id;
    public Movie(String movie_name,String produced_by){//,String directed_by,String duration,String year,String category
        this.produced_by=produced_by;
        this.movie_name=movie_name;
//        this.directed_by=directed_by;
//        this.duration=duration;
//        this.year=year;
//        this.category=category;
    }
    public void display(){
        System.out.println("Name of the movie:"+this.movie_name);
        System.out.println("Name of the Producer:"+this.produced_by);
        System.out.println("Name of the Director"+this.directed_by);
        System.out.println("Duration of movie:"+this.duration);
        System.out.println("Release Date:"+this.year);
        System.out.println("Category:"+this.category);
    }
    protected static ArrayList<Movie> list=new ArrayList<>();
    public static void addMovie(){
        Scanner s=new Scanner(System.in);
        System.out.println("Write Movie Name:");
        String name=s.nextLine();
        System.out.println("Producer Name:");
        String prod_by=s.nextLine();

        Movie m=new Movie(name,prod_by);//,"","","",""
        addetails(m,s);
        list.add(m);
    }
    public static void addMovieInt(String country,String language){
        Scanner s=new Scanner(System.in);
        System.out.println("Write Movie Name:");
        String name=s.nextLine();
        System.out.println("Producer Name:");
        String prod_by=s.nextLine();

        Movie m=new InternationalMovie(name,prod_by,country,language);//,"","","",""
        addetails(m,s);
        list.add(m);
    }
    public static void addMovieSpc(String soundEffectsTechnology,String visualEffectsTechnology){
        Scanner s=new Scanner(System.in);
        System.out.println("Write Movie Name:");
        String name=s.nextLine();
        System.out.println("Producer Name:");
        String prod_by=s.nextLine();

        Movie m=new SpecialMovie(name,prod_by,soundEffectsTechnology,visualEffectsTechnology);//,"","","",""
        addetails(m,s);
        list.add(m);
    }
    private static void addetails(Movie m,Scanner s){
        System.out.println("Want to add more details then type y else n");
        String opt=s.nextLine();
        if(opt.equals("y")){
            System.out.println("Write the name of Director");
            m.directed_by=s.nextLine();
            System.out.println("Duration(hr:min):");
            m.duration=s.nextLine();
            System.out.println("Launch date(dd/mm/yyyy):");
            m.year=s.nextLine();
            System.out.println("Category:");
            m.category=s.nextLine();
            m.count_Movie=list.size()+1;
            m.movie_id=m.movie_name+"_"+ Integer.toString(m.count_Movie);
        }else{
            m.directed_by="Not Available";
            m.duration="Not Available";
            m.year="Not Available";
            m.category="Not Available";
            m.count_Movie=list.size()+1;
            m.movie_id=m.movie_name+"_"+ Integer.toString(m.count_Movie);
        }
    }
    public String showDetails(){
        String concat;
        concat=this.movie_name+" "+this.produced_by+" "+this.directed_by+" "+this.category;
        return concat;
    }
    public static void allMovie(){
        for(Movie m: list){
            m.display();
            System.out.println(m.showDetails());
            System.out.println("-------------------------------------------");
        }
    }
}
class InternationalMovie extends Movie{
    String country;
    String language;
    public InternationalMovie(String movie_name, String produced_by,String country,String language) {
        super(movie_name, produced_by);
        this.country=country;
        this.language=language;
    }
    public void display() {
        super.display();
        System.out.println("Movie produced in:"+this.country);
        System.out.println("Original language:"+this.language);
    }
}
class SpecialMovie extends Movie{
    String soundEffectsTechnology;
    String visualEffectsTechnology;
    public SpecialMovie(String movie_name, String produced_by,String soundEffectsTechnology,String visualEffectsTechnology) {
        super(movie_name, produced_by);
        this.soundEffectsTechnology=soundEffectsTechnology;
        this.visualEffectsTechnology=visualEffectsTechnology;
    }
    public void display() {
        super.display();
        System.out.println("Movie produced in:"+this.soundEffectsTechnology);
        System.out.println("Original language:"+this.visualEffectsTechnology);
    }

}
