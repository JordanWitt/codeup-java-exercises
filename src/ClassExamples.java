import java.util.Arrays;

public class ClassExamples {
    public static void main(String[] args) {
        //START OF CLASS EXAMPLES
        //array had precise length property, might have limited space in memory, needs to allocate/prep when specified
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
        for (String food : foods) {
            System.out.println(food);

        }
        //working with array:
        //Havan (idk what I meant to type there) will have different classes that can assist us
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
        for (int num : favoriteNumber10xs) {
            System.out.println(num);
        }
        System.out.println("SPACE");

        //Arrays.equals
        int[] favoriteNumber10xsAgain = Arrays.copyOf(favoriteNumber10xs, 10);// if the 10(amount) changes ut becomes false
        for (int i : favoriteNumber10xsAgain) {
            System.out.println(i);
        }
        System.out.println(Arrays.equals(favoriteNumber10xs, favoriteNumber10xsAgain));

        //Arrays.sort [sort elements in ascending order]

        Arrays.sort(foods);
        System.out.println(Arrays.toString(foods));

        //Arrays in arrays || matrix/matrices // 2d arrays []

        int[][] myMatrix = {
                {1, 2, 3},
                {5, 5, 6},
                {7, 8, 9}
        };
        System.out.println((Arrays.toString(myMatrix)));
        for (int[] matrix : myMatrix) {
            System.out.println(Arrays.toString(matrix));
        }
        // grabbing a single number by index from the list of arrays

        System.out.println(myMatrix[1][2]);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");
    }
}
