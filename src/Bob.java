import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        String cont;
        do { System.out.print("Hello, I'm AI Bob: ");
            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.nextLine();
            int strLength = userInput.length();


            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (strLength == 0) {
                System.out.println("Fine. Be that way!");
            } else {System.out.println("Whatever");}

            System.out.print("Want to continue (Y/N): ");

            cont = scanner.next();
        } while (cont.equalsIgnoreCase("y"));

    }
}
