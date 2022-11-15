import java.util.Random;
import java.util.Scanner;
public class textAdventure2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String[] evilHomework = {"Html", "CSS" , "JavaScript", "Java", "Spring" , "Git", "Something difficult"};
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
        while(struggling){
            int homeworkHealth = rand.nextInt(maxEvilHomeworkHealth);
            String homework = evilHomework[rand.nextInt(evilHomework.length)];

            System.out.println("Oh no! " + homework + " is here!");
            while (homeworkHealth > 0){
                System.out.println("Your current knowledge " + knowledge + "!");
                System.out.println(homework + " homework difficulty " +homeworkHealth);
                System.out.println("What would you like to do?");
                System.out.println("1. ATTACK with more studying");
                System.out.println("2. Practice for better results");
                System.out.println("3. Leave it all behind, this is not my battle");

                String input = in.nextLine();
                if(input.equals("1")){
                    int knowledgeLearned = rand.nextInt(attackDamage);
                    int knowledgeMisunderstood = rand.nextInt(whatIDontKnow);

                    System.out.println("You have gained " + knowledgeLearned + "!");
                    System.out.println("Brain is becoming cloudy with " + knowledgeMisunderstood + " misunderstandings");

                    knowledge -= knowledgeMisunderstood;
                    homeworkHealth -= knowledgeLearned;

                }
            }
        }

    }
}
