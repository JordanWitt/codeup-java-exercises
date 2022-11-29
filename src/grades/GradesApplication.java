package grades;

import java.util.Scanner;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    Scanner in = new Scanner(System.in);
    static Input input = new Input();

    static boolean running = input.yesNo();

    public static void gradesApp() {
        HashMap<String, Student> Students = new HashMap<>();
        Student Bifor = new Student("Bifor");
        Student Bofur = new Student("Bofur");
        Student Kili = new Student("Kili");
        Student Fili = new Student("Fili");
        //Bilfor
        Bifor.addGrade(99);
        Bifor.addGrade(78);
        Bifor.addGrade(89);
        Bifor.addGrade(79);
        //Bofur
        Bofur.addGrade(88);
        Bofur.addGrade(64);
        Bofur.addGrade(64);
        Bofur.addGrade(69);
        //Kili
        Kili.addGrade(55);
        Kili.addGrade(99);
        Kili.addGrade(64);
        Kili.addGrade(64);
        //Fili
        Fili.addGrade(94);
        Fili.addGrade(64);
        Fili.addGrade(86);
        Fili.addGrade(64);

        Students.put("Bifor12D", Bifor);
        Students.put("Bofur11d", Bofur);
        Students.put("Kili09d", Kili);
        Students.put("Fili08D", Fili);

        System.out.println("\t\t\t\t\t\t\t\t\t\tSchool of Dwarves");
        System.out.println("Select from a list of Dwarves to view stats: ");
        System.out.println("\tBifor12D");
        System.out.println("\tBofur11d");
        System.out.println("\tKili09d");
        System.out.println("\tFili08D");
        System.out.println("\t6. View all");
        System.out.println("\t5. Opt Out");

        label:
        while(running) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine(); //IntelliJ recommended switch case instead of If/Else
            switch (input) {
                case "Bifor12D":
                    System.out.println("Username: Bifor12D, " + "Name: " + Bifor.getName() + ", Grade Average: " + Bifor.getGradeAverage());
                    break;
                case "Bofur11d":
                    System.out.println("Username: Bofur11d, " + "Name: " + Bofur.getName() + ", Grade Average:  " + Bofur.getGradeAverage());
                    break;
                case "Kili09d":
                    System.out.println("Username: Kili09d, " + "Name: " + Kili.getName() + ", Grade Average:  " + Kili.getGradeAverage());
                    break;
                case "Fili08D":
                    System.out.println("Username: Fili08D, " + "Name: " + Fili.getName() + ", Grade Average:  " + Fili.getGradeAverage());
                    break;
                case "6":
                    Students.forEach((s, student) -> {
                        System.out.println(s + ", " + student.getName() + ", " + student.getGradeAverage());
                    });
                default:
                    System.out.println("Exiting Dwarves");
                    break label;
            }
        }
    }
    public static void main(String[] args) {
        gradesApp();
    }
}