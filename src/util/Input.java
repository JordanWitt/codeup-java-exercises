package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter some String: ");
        return scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Enter yes or no: ");
        String input = scanner.next();
        if(input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")){
            System.out.println("You entered yes: ");
            return true;
        }
        System.out.println("You entered no: ");
        return false;
    }
}
