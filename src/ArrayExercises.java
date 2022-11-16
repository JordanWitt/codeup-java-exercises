import java.net.SocketOption;
import java.util.Arrays;
import java.util.Random;
public class ArrayExercises {
    public static void main(String[] args) {
        //QUESTION 1
        String[] peoples = {"Jordan ", "Anakin ", "Obi K ", "Padme "};
        for (String people : peoples) {
            System.out.println(people);
        }
        System.out.println("-------NEW ARRAY-------");

            String[] newPeoples = Arrays.copyOf(peoples, peoples.length + 1);
            // creating a new copy plus one to add
            newPeoples[peoples.length] = "Han Solo, " + "\n" + "Boba";
            for(String pepe : newPeoples){
                System.out.println(pepe);
            }
            System.out.println(Arrays.toString(newPeoples));
        }
    }




