package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {

        int attempt = 0;
        Input movie = new Input();
        Movie[] movieList = Arrays.copyOf(MoviesArray.findAll(), 100);//99 movies listed?

        System.out.println("-----------------------MOVIES-----------------------");
        System.out.println();
        MOVIES:
        while (true) {
            System.out.println("\tWhat would you like to do?");
            System.out.println("\t0 - Exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - view movies in animated category");
            System.out.println("\t3 - view movies in drama category");
            System.out.println("\t4 - view movies in horror category");
            System.out.println("\t5 - view movies in scifi category");
            System.out.println("\t6 - view movies in musical category");
            System.out.println("\t7 - view movies in comedy category");
            int decisions = movie.getInt();
            for (Movie value : movieList) {
                if (decisions == 1) {
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 2 && value.getCategory().equals("animated")) {
                    System.out.println("Animations: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 3 && value.getCategory().equals("drama")) {
                    System.out.println("Dramas: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 4 && value.getCategory().equals("horror")) {
                    System.out.println("Horror: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 5 && value.getCategory().equals("scifi")) {
                    System.out.println("Sci-Fi: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 6 && value.getCategory().equals("musical")) {
                    System.out.println("Musicals: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                } else if (decisions == 7 && value.getCategory().equals("comedy")) {
                    System.out.println("Comedies: ");
                    System.out.println(value.getName());
                    System.out.println("--------------------");
                    continue MOVIES;
                }
            }attempt++;
            if (decisions == 0) {
                break;
            }
        }
        System.out.println("See ya later! Here's how many times you viewed our Movies: " + attempt);
    }
}
