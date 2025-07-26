package com.lab.lab4;

import java.util.Scanner;

public class Main {
    Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
//        ArrayList<Movie> movies = new ArrayList<>();
        Main main = new Main();
//        while (true) {
//            System.out.println("Do you want to add a movie? (y/n)");
//            String choice = main.s.nextLine();
//            if (choice.equalsIgnoreCase("y")) {
//                Movie.addMovie();
//                System.out.println("Movie added successfully!");
//            } else if (choice.equalsIgnoreCase("n")) {
//                break;
//            } else {
//                System.out.println("Invalid choice, please enter 'y' or 'n'.");
//            }
//        }
        while(true){
            System.out.println("for adding movie type: 1\nfor adding international movie type:2\nfor adding special movie type:3\nType any number between 4 to 10 for exiting the adding section");
            byte choice=main.s.nextByte();
            String choiceExit="n";
            switch (choice){
                case 1:
                    Movie.addMovie();
                    break;
                case 2:
                    main.s.nextLine();
                    System.out.println("Country of Origin:");
                    String country=main.s.nextLine();
                    System.out.println("Language it is shoot in:");
                    String language=main.s.nextLine();
                    Movie.addMovieInt(country,language);
                    break;
                case 3:
                    main.s.nextLine();
                    System.out.println("Country of Origin:");
                    String soundET=main.s.nextLine();
                    System.out.println("Language it is shoot in:");
                    String visualET=main.s.nextLine();
                    Movie.addMovieSpc(soundET,visualET);
                    break;
                default:
                    System.out.println("you selected exit option, you want to exit(y/n)");
                    main.s.nextLine();
                    choiceExit=main.s.nextLine();
                    break;
            }
            if(choiceExit.equalsIgnoreCase("y")){
                break;
            }
        }
        Movie.allMovie();

        for(Movie m: Movie.list){
            if(m instanceof SpecialMovie){
                SpecialMovie m1=(SpecialMovie) m;
                m1.getspecial();
            } else if (m instanceof InternationalMovie) {
                InternationalMovie m2=(InternationalMovie) m;
                m2.getinternational();
            }
        }

    }

}
