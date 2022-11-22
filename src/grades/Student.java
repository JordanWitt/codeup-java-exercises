package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.name = studentName;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int gradeAverage = 0;
        for (int i = 0; i < grades.size(); i++) {
            gradeAverage += grades.get(i); //.get gives list access, IntelliJ suggested.
        }
        return gradeAverage / grades.size();// floating point context?
    }

    public static void main(String[] args) {
    Student newStudent = new Student("Jordan Witt");
    newStudent.addGrade(99);
    newStudent.addGrade(78);
    newStudent.addGrade(89);
    newStudent.addGrade(79);
    System.out.println(newStudent.getGradeAverage());
    }
}
