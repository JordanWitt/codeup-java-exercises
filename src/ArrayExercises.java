import java.net.SocketOption;
import java.util.Arrays;
import java.util.Random;
public class ArrayExercises {
    //class examples
    //array had precise length property, might have limited space in memory, needs to allocate/prep when specified
    public static void main(String[] args) {
        final int four = 4; // const of four
        int two = 2;
        // have to declare type and size
        int[] myArr;

        myArr = new int[four]; //space for 4 elements

        int[] myArr2 = new int[two]; //combined into one line //space for 2 elements

       String[] foods = {"pie ", "burger ", "pizza ", "taco"};
       System.out.println(foods[0]);
//      for loop example to display the whole array

//               for(int i = 0; i < food.length; i++){
//                   System.out.println(food[i]);
//               }

        //broken down for each without using for loop.
        for(String food : foods) {
            System.out.println(food);

        }
        //working with array:
        //Havan will have different classes that can assist us
        //math stuff, I can't type that fast
        // arrays plural, many somethings to use.
        // . fill
        // . equals
        // . copyOF
        // . toString
        // . sort

        // filling in my favorite number of "8" 10 times
        int[] favoriteNumber10xs = new int[10];
        Arrays.fill(favoriteNumber10xs, 8);
        for(int num : favoriteNumber10xs){
            System.out.println(num);
        }
 System.out.println("SPACE");

        //Arrays.equals
        int[] favoriteNumber10xsAgain = Arrays.copyOf(favoriteNumber10xs, 10);// if the 10(amount) changes ut becomes false
        for(int i : favoriteNumber10xsAgain){
            System.out.println(i);
        }
        System.out.println(Arrays.equals(favoriteNumber10xs, favoriteNumber10xsAgain));

        //Arrays.sort [sort elements in ascending order]

        Arrays.sort(foods);
        System.out.println(Arrays.toString(foods));
    }
}
