package fileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classExample {
    public static void  printString(Path filePath) throws
            IOException{
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        // we need List as .readAllLines returns datatype
        for(int i = 0; i < fileContents.size(); i ++){
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }
    public static void main(String[]args) throws IOException {
        Path filepath = Paths.get("./src/fileIO/wow.txt");
        printString(filepath);
        // relative paths, start with root vs specific users file system <--(which is absolute)
        Path examplePath = Paths.get("/nota/", "/realpath");
        System.out.println(examplePath + "examplePath");
        //Boolean - is it true or false that something exists where this path object goes
        //FALSE nothing exists on the end of this path. No DATA listed in "/nota", "/filepath"
        //use files.exists to check if that file exists
        System.out.println("Files.exist" + Files.exists(examplePath));
        //CRUD - create directories/files, Reading directories/files
        //directory and new file for grocerys/grades
        // need directory to save it
        String directory = "./src/data";
        String filename = "groceryList.txt";


        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        System.out.println("Data Directory " + dataDirectory);
        System.out.println("Data File " + dataFile);
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }
        if(Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }
        Path groceryListPath = Paths.get(directory, filename);
        System.out.println("files " + Files.exists(groceryListPath));
        List<String> groceryList = new ArrayList<>();
        String item1 ="bread";
        groceryList.add(item1);
        groceryList.add("ceral");
        groceryList.add("dog food");
        System.out.println("list " + groceryList);
        //grocery list ready to go write in file.txt
        //path is where it's going, the list is what's going inside
        Files.write(groceryListPath, groceryList);
        //saw the creation, bring string back OUT of file and into java (read)
        List<String> printlistfromfile = Files.readAllLines(groceryListPath);
        System.out.println(printlistfromfile);
        // the list gets printed back into the file.
        //could use a for loop
        for(int i = 0; i < printlistfromfile.size(); i++){
            System.out.println(printlistfromfile.get(i));
            //get object found at the index of i (another way to print out the list)
        }
        //updating operations, updating the same file instead of making a new one
        //STANDARD OPEN OPTION S.O.O
        //use same file, update, but not create new file
        Files.write(groceryListPath, Arrays.asList("food,", "more ", "and more", "ad even more "," dsfhsdfhsdkfh"), StandardOpenOption.APPEND);
        // need to update variable with new appended information
        printlistfromfile = Files.readAllLines(groceryListPath);
        for(int i = 0; i < printlistfromfile.size(); i++){
            System.out.println(printlistfromfile.get(i));
        }
        // Manipulating files, fine line and replace, could be a "delete" method if we replace
        printlistfromfile = Files.readAllLines(groceryListPath);
        List<String> newList = new ArrayList<>();
        for(String line : printlistfromfile){
            if(line.equals("food")){
                newList.add("Brie Cheese");
                continue;
                // every line that contains food, change it to brie cheese from the new array creation
            }
            newList.add(line);
            //otherwise just add new item to list if it does not exist
            // if it finds food, it'll replace it with brie cheese
        }
        Files.write(groceryListPath, newList);
        //adds it to path and the previous list
    }
}
