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
      int attempt = 1;
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
              System.out.println("\tYour HP: " + health); //player health
              System.out.println("\t" + enemy +"'s HP: " + enemyHealth); //e health
              System.out.println("\n\tWhat would you like to do?");
              System.out.println("\t1 Attack");
              System.out.println("\t2 Drink health potion");
              System.out.println("\t3 Run!\n"); //player options

              //if user input = 1
              String input = in.nextLine(); //grabs next line from console/ user input
              if(input.equals("1")) {
                int damageDealt = rand.nextInt(attackDamage);
                int damageTaken = rand.nextInt(enemyAttackDamage);

                enemyHealth -= damageDealt;
                health -= damageTaken; //health goes down

                  System.out.println("\t You strike the " + enemy + " for " + damageDealt + " damage");
                  System.out.println("\t You recieve " + damageTaken + " in retaliation!");

                  if(health <= 1) {
                      System.out.println("\t You have taken too much damage, you are too weak to continue on!");
                      break;
                  }
              }
              // if user input = 2
              else if(input.equals("2")) {
                  if(numHealthPotions > 0) {
                      health += healthPotionHealAmoutn;
                      numHealthPotions--;
                      System.out.println("\t > You drink a health potion, healing yourself for " +
                              healthPotionHealAmoutn + ". " + "\n\t> You now have " + health + " HP"
                              + "\n\t> You have " + numHealthPotions + " health potions left.\n");// health potion output
                  }
                  // system out print when the user runs out of potions
                  else {
                      System.out.println("\t> You have no health potions left! Defeat enemies for a change to get one");
                  }

              }
              // if user input = 3
              else if(input.equals("3")) {
                  System.out.println("\t You run away from the " + enemy + "!");
                  continue GAME; //brings it back to the START of loop vs the attack iteration
              }
              // if the user input is not one of the options listed
              else {
                  System.out.println("\tInvalid command");

              }
          }
          // break out of second loop if user can't continue
          if(health < 1) {
              System.out.println("You limp out of the dungeon, weak from battle.");
              break;
          }
          System.out.println("------------------------------------------------------");
          System.out.println(" # " + enemy + " was defeated! # ");
          System.out.println(" # You have " +health + " HP left. # " );
          if(rand.nextInt(100) < healthPotionDropChance) { // generating random # between 0/100 50% chance

              numHealthPotions++;
              System.out.println(" # The " + enemy + " dropped a health potion! #");
              System.out.println(" # You now have " + numHealthPotions + " health potions. # ");
          }
          System.out.println("------------------------------------------------------");
          System.out.println("What would you like to do now?");
          System.out.println("1: Continue fighting");
          System.out.println("2: Exit dungeon");

          String input = in.nextLine();
            //new while loop for new player options 1. continue or 2. exit
           // going to keep running question until user types proper input value
          while(!input.equals("1") && !input.equals("2")) {
              System.out.println("Invalid command");
              input = in.nextLine();
          }
          // what to do when they wish to continue
          if (input.equals("1")){
              System.out.println("You continue on your adventure!");
              attempt++;
          }
          else if (input.equals("2")){
              System.out.println("You exit the dungeon from your adventure, sweet victory");
              break; // break the loop if they exit
          }
      }
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
    }
}
