package InheritanceAndPolymorphism;

public class Employee extends Person{
    public String jobTitle;
//    HEllO WORLD
    public Employee(String employeeName, String title){
        super(employeeName);
        this.jobTitle = title;
    }
    public static void main(String[]args){
        Employee one = new Employee("Jor Jor", "Web Developer");
        System.out.println("Hello " + one.name + ". " + one.name + " is a " + one.jobTitle );
        one.introduction();
    }
}
