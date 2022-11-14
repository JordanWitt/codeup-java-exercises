import java.util.Random;
import java.util.Scanner;
public class textAdventure {
    public static void main(String[] args) {
    // System objects
    Scanner in = new Scanner(System.in);
    Random rand = new Random(); //randomize

    //Game variables
     String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" }; // type of enemies
     int maxEnemyHealth = 75; //enemy starting health
     int enemyAttackDamage = 25; // enemy attack damage

     //Player variables

      int health = 100; //player starting health
      int attackDamage = 50; //player attack damage
      int numHealthPotions = 3; //amount of health potions
      int healthPotionHealAmoutn = 30; //heal amount for potions
      int healthPotionDropChance = 50; // 50 percent chance enemy drops a health potion

      boolean running = true;

      System.out.println("\t\t\t\tWelcome to the Dungeon!");

      GAME:
      while (running) {
          System.out.println("------------------------------------------------------");

          int enemyHealth = rand.nextInt(maxEnemyHealth); // random starting enemy health between 0 = 75
          String enemy = enemies[rand.nextInt(enemies.length)];//pull random enemy from the length of enemies array

          System.out.println("\t# " + enemy + " appeared! #\n");// #\n is line break
          //            # skeleton has appeared!   # example
          while(enemyHealth > 0) { // iteration of attacks/player options
              System.out.println("\tYour HP:" + health); //player health
              System.out.println("\t" + enemy +"'s HP:" + enemyHealth); //e health
              System.out.println("\n\tWhat would you like to do?");
              System.out.println("\t1 Attack");
              System.out.println("\t2 Drink health potion");
              System.out.println("\t3 Run!"); //player options
              System.out.println("\tHint: Your starting HP is full");

              String input = in.nextLine(); //grabs next line from console/ user input
          }


      }

    }
}
