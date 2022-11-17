import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ServerNameGenerator {
    public static void main(String[]args){
        Random rand = new Random();
        String[] tenAdjectives = {"Everywhen ", "Hullaballoo ", "Biblioklept ", "Rhumba ", "Nippy ", "Whippersnapper ", "Cattywampus ", " Bamboozled ", "Thundering ", "Functional "};
        String[] tenNouns = {"Balaclava ", "Monocle ", "Revolver ", "Subaru ", "Diving Rod ", "British Shorthair ", "Diesel Exhaust Fluid ", "Gloabl Warming ", "Rumours ", "Hamsters"};

        System.out.println("Server Name: " + tenAdjectives[rand.nextInt(tenAdjectives.length)] + tenNouns[rand.nextInt(tenNouns.length)]);

    }
}
