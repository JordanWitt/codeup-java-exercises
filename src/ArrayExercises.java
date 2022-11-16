import java.net.SocketOption;
import java.util.Arrays;
import java.util.Random;
public class ArrayExercises {
    //START OF CLASS EXAMPLES
    //array had precise length property, might have limited space in memory, needs to allocate/prep when specified
    public static void main(String[] args) {
        //QUESTION 1
        String[] peoples = {"Jordan ", "Anakin ", "Obi K ", "Padme "};
        for (String people : peoples) {
            System.out.println(people);
        }
            String[] newPeoples = Arrays.copyOf(peoples, peoples.length + 1); // creating a new copy plus one to add
            newPeoples[peoples.length] = "Han Solo";
            System.out.println(Arrays.toString(newPeoples));

        }
    }



