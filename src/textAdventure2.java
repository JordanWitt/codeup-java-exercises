import java.util.Random;
import java.util.Scanner;

public class textAdventure2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String[] evilHomework = {"Html", "CSS", "JavaScript", "Java", "Spring", "Git", "Something difficult"};
        int maxEvilHomeworkHealth = 90;
        int whatIDontKnow = 60;

        // user
        int attempts = 1;
        int knowledge = 70;
        int attackDamage = 50;
        int homeworkRedDo = 1;
        int homeworkSuccess = 30;
        int homeworkReDoChance = 50;

        boolean struggling = true;

        System.out.println("^(#｀∀ ´)_Ψ-----------Welcome to Codeup-----------∋━━o(｀∀ ´oメ）～→");

        GAME:
        while (struggling) {
            int homeworkHealth = rand.nextInt(maxEvilHomeworkHealth);
            String homework = evilHomework[rand.nextInt(evilHomework.length)];

            System.out.println("Oh no! " + homework + " is here!");
            while (homeworkHealth > 0) {
                System.out.println("Your current knowledge " + knowledge + "!");
                System.out.println(homework + " homework difficulty " + "is at " + homeworkHealth);
                System.out.println("-------------------------------------------");

                System.out.println("What would you like to do?");
                System.out.println("1. ATTACK with more studying");
                System.out.println("2. Practice for better results");
                System.out.println("3. Leave it all behind, this is not my battle");
                System.out.println("-------------------------------------------");
                String input = in.nextLine();
                if (input.equals("1")) {
                    int knowledgeLearned = rand.nextInt(attackDamage);
                    int knowledgeMisunderstood = rand.nextInt(whatIDontKnow);

                    System.out.println("You have gained " + knowledgeLearned + " knowledge!");
                    System.out.println("But now your brain is becoming cloudy with even more " + knowledgeMisunderstood + " misunderstandings");
                    System.out.println("-------------------------------------------");

                    knowledge -= knowledgeMisunderstood;
                    homeworkHealth -= knowledgeLearned;

                    if (knowledge <= 5) {
                        System.out.println(homework + " has beaten your brain, you are too weak to go on.");
                        break;
                    }
                    System.out.println("You studied your butt off " + homework + " is less frightening " + " you've gained " + knowledge + " in knowledge!");
                } else if (input.equals("2")) {
                    if (homeworkRedDo > 0) {
                        knowledge += homeworkSuccess;
                        homeworkRedDo--;
                        System.out.println("You receive an opportunity to redo. You have gained " + knowledge + " in knowledge and have " + homeworkRedDo + " retakes left.");
                    } else {
                        System.out.println("You have ran out of chances, tackle more homework to get another opportunity.");
                    }
                } else if (input.equals("3")) {
                    System.out.println("You leave " + homework + ", never looking back.");
                    continue GAME;
                } else {
                    System.out.println("Invalid command");
                }
            }
            if (knowledge < 5) {
                System.out.println("You've studied the best you could, you shut down the computer and leave the house.");
                break;
            }
            System.out.println("-------------------------------------------");
            System.out.println(homework + " was tackled successfully and everything was understood!");
            System.out.println("You have " + knowledge + " left.");
            if (rand.nextInt(100) < homeworkReDoChance) {
                homeworkRedDo++;
                System.out.println(homework + " gave you an opportunity to retake");
                System.out.println("You have " + homeworkRedDo + " opportunities");
            }
            System.out.println("-------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue working");
            System.out.println("2. Leave and never look back");
        }
        String input = in.nextLine();
        while (!input.equals("1") && !input.equals("2")) {
            System.out.println("invalid command");
        }
        if (input.equals("1")) {
            System.out.println("You continue working.");
            attempts++;
        } else if (input.equals("2")) {
            System.out.println("You leave and never touch your laptop again");
        }System.out.println("You have successfully passed with " + attempts + " attempts.");
    }
}