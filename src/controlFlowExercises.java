import java.util.Scanner;
public class controlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }

//        int i = 2;
//        do {
//            System.out.println(i += 2);
//        }while (i < 100);
//
//        for (int q = 5; q <= 15; q ++) {
//            System.out.println(q);
//        }

//          for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz " + i);
//            }
//        }

//                Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter a number: ");
//             int userInput = scanner.nextInt();
//             for (int i = 0; i <= userInput; i++) {
//             if (i == 0) {
//                System.out.println("Here is your table!");
//                System.out.println("number | squared | cubed");
//             }else {
//                 System.out.println(i + "      | " + i*i + "       | " + i*i*i);
//        }
//
//        }

             Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your grade: ");
            int userInput = scanner.nextInt();
             if (userInput >= 91 & userInput <= 100) {
            System.out.println("You got an A " + userInput);
              } else if (userInput >= 81 && userInput <= 90) {
            System.out.println("You got an B " + userInput);
              } else if (userInput >= 71 && userInput <= 80) {
            System.out.println("You got an C " + userInput);
                } else if (userInput >= 60 && userInput <= 70) {
            System.out.println("You got an D " + userInput);
             } else {System.out.println("You got an F " + userInput);}

    }
}
