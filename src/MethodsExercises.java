import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.InputMismatchException;

public class MethodsExercises {
    public static void main(String[] args) {
        // question 1
        int result = 0;
        // adds two numbers
        result = 10 + 15;
        System.out.println("10 + 15 = " + result);

        //subtract 10, 15 by 20
        result = 10 + 15 - 20;
        System.out.println("10 + 15 - 20 = " + result);

        // multiply 10, 15 by 3
        result = 10 + 15 * 3;
        System.out.println("10 + 15 * 3 = " + result);

        // divide 10, 15 by 5
        result = 10 + 15 / 5;
        System.out.println("10 + 15 / 5 = " + result);

        // question two

        Scanner in = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.println("Enter a number between 1 and 10: ");
                number = in.nextInt();
                if (number >= 1 && number <= 10) {
                    break;
                }
                System.out.println("Out of range.");
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Integer!");
                in.nextLine(); //needed to clear buff
            }
        }
        System.out.println("You entered: " + number);

        // question 3
      System.out.println("Enter an Integer: ");
      int num = in.nextInt();
      int factorial = 1;
      for(int i = 1; i <= num; i++){
          factorial = factorial*i;
      }
      System.out.println("Factorial of the Number: " + factorial);
    }
}
