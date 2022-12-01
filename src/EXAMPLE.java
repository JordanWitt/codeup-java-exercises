import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMPLE {
    public static void main(String[] args) {
        System.out.println("Enter an option");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i< size; i++){
            myArray[i] = s.nextInt();
        }
        System.out.println("contents " + Arrays.toString(myArray));
    }
}
