import java.util.Random;
import java.util.Scanner;
public class textAdventure {
    public static void main(String[] args) {
    // System objects
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    //Game variables
     String() enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" }; // type of enemies
     int maxEnemyHealth = 75; //enemy starting health
     int enemyAttackDamage = 25; // enemy attack damage

     //Player variables

      int health = 100; //player starting health
      int attackDamage = 50; //player attack damage
      int numHealthPotions = 3; //amount of health potions
      int healthPotionHealAmoutn = 30; //heal amount for potions
      int healthPotionDropChance = 50; // 50 percent chance enemy drops a health potion

      boolean running = true;

      System.out.println("Welcome to the Dungeon!");

      GAME:
      while (running) {
          System.out.println("----------------------------------------------------------------");

      }

    }
}
