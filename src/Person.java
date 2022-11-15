//class Student {
// public String name;
// public String cohort;
//
// public Student(String studentName) {
//  name = studentName;
//  cohort = "Unassigned";
// }
//
// public Student(String studentName, String assignedCohort) {
//  name = studentName;
//  cohort = assignedCohort;
// }
//
// public String getInfo() {
//  return String.format("name: %s, cohort: %s", name, cohort);
// }
//
// public static void main(String[] args) {
//  Student s1 = new Student("Student A");
//  Student s2 = new Student("Student B", "Voyagers");
//  System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
//  System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"
// }
//}
// Question 1
class Person {
 private String firstName;
 private String lastName;
 private int age;

 public Person(String first, String last, int years) {
 firstName = first;
 lastName = last;
  age = years;

 }
public String getFirstName() {
  return firstName;
}
 public void setFirstName(String first){
//TODO: change the name field to the passed value
 firstName = first;

 }
 public String getLastName(){
  return lastName;
 }
public void setLastName(String last){
  lastName = last;
}
public int getAge(){
  return age;
}
public void setAge(int years){
   age=years;
}
public void sayHello(){
  System.out.println("Hola " + getFirstName() + " " + getLastName());
}
 public static void main(String[] args) {
Person person = new Person("Jordan ", "Witt", 28);
System.out.println(person.getFirstName() + person.getLastName());
System.out.println(person.getAge());
person.sayHello();

Person person1 = new Person("Jordan", "Witt", 28);
person1.setFirstName("Darth");
person1.setLastName("Vader");
person1.setAge(62);
System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge());
person1.sayHello();
 }
}

