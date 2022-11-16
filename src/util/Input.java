package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    //STRING INPUT
    public String getString(){
        System.out.println("Enter some String: ");
        return scanner.nextLine();
    }
    //BOOLEAN Y/N
    public boolean yesNo() {
        System.out.println("Enter yes or no: ");
        String input = scanner.next();
        if(input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")){
            System.out.println("You entered: ");
            return true;
        }
        System.out.println("You entered: ");
        return false;
    }
    //MAX MIN INT
    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d", min, max);//error printing with println and print
        int input = scanner.nextInt();
        if(input > min && input < max){
            return input;
        }else{
            System.out.println("Sorry, that's not a valid command");
        }return input;
    }
}
