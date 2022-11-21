package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int attempt = 0;
        Movie[] allmovies = Arrays.copyOf(MoviesArray.findAll(), 100);//99 movies listed?
        boolean continues = input.yesNo();
        boolean running = true;

        System.out.println("-----------------------MOVIES-----------------------");
        System.out.println();
        MOVIE:
        while (running) {
            System.out.println("\tWhat would you like to do?");
            System.out.println("\t0 - Exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - view movies in animated category");
            System.out.println("\t3 - view movies in drama category");
            System.out.println("\t4 - view movies in horror category");
            System.out.println("\t5 - view movies in scifi category");
            System.out.println("\t6 - view movies in musical category");
            System.out.println("\t7 - view movies in comedy category");
            int decision = input.getInt();

            for (int i = 0; i < allmovies.length; i++) {
                if (decision == 0) {
                    break;
                } else if (decision == 1) {
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 2 && allmovies[i].getCategory().equals("animated")) {
                    System.out.println("\tAnimations: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 3 && allmovies[i].getCategory().equals("drama")) {
                    System.out.println("\tDrama: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 4 && allmovies[i].getCategory().equals("horror")) {
                    System.out.println("\tHorror: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 5 && allmovies[i].getCategory().equals("scifi")) {
                    System.out.println("\tSci-Fi: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 6 && allmovies[i].getCategory().equals("musical")) {
                    System.out.println("\tMusical: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                } else if (decision == 7 && allmovies[i].getCategory().equals("comedy")) {
                    System.out.println("\tComedy: ");
                    System.out.println(allmovies[i].getName());
                    System.out.println("\t--------------------------");
                    //IF INPUT IS NOT EQUAL TO ANY SUGGESTION
                }else{
                    System.out.println("\t-----Sorry that's not a valid input-----");
                    break;
                }
            }
        }
        System.out.println("See ya later!");
    }
}