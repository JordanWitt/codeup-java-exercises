import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.InputMismatchException;

public class MethodsExercises {
    public static void main(String[] args) {
//         question 1
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
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the Number: " + factorial);


        int n;
        while (true) {
            try {
                System.out.println("Enter a number between 1 and 10: ");
                n = in.nextInt();
                if (n >= 1 && n <= 10) {
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                        System.out.println(fact);
                    }
                    break;
                }
                System.out.println("Out of range.");
            } catch (InputMismatchException e) {
                System.out.println("You did not enter a Number!");
                in.nextLine(); //needed to clear buff
            }
        }
        System.out.println("You entered: " + n);

        // question 4
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int sum = dice1 + dice2;

        while (true) {
            System.out.println();
            System.out.println("Rolling the dice " + attempt + " time(s)!");

            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            sum = dice1 + dice2;

            System.out.println("Roll: total = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("###### Sorry with a " + sum + " you loose! ######");
                System.out.println();
                break;
            } else if (sum == 7 || sum == 11) {
                System.out.println("###### With a " + sum + " you win! ######");
                System.out.println();
                break;
            }
            System.out.println();
            System.out.println("Do you wish to continue? Press 'y' for YES or ANY key for EXIT");
            if (!scanner.next().equalsIgnoreCase("y")) {
                break;
            }
            attempt++;
        }
        System.out.println("Thanks for playing dice game, you rolled the dice " + attempt + " times!");
    }
}





