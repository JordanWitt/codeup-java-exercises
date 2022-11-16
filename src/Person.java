
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
// trying it again to really understand it
class Podracers {
    private String name;
    private String pod;

   public Podracers(String name, String pod){
       this.name = name;
       this.pod = pod;
   }
   public String getName(){
       return name;
   }
    public void setName(String name){
    this.name = name;
    }
    public String getPod(){
       return pod;
    }
    public void setPod(String pod){
       this.pod = pod;
    }
    public void introduction(){
       System.out.println("That's absolutely right. And a big turnout here, from all corners of the Outer Rim territories.\nI see the contestants are making their way out onto the starting grid. \nHere we have " + getName() + " " + "in their " + getPod() + " Going to be a touch one to beat!");
    }
    public static void main(String[]args){
       Podracers podracers = new Podracers("Anakin Skywalker", "\n" +
               "Repulsorcraft with the Radon-Ulzer 620c turbines");
       System.out.println(podracers.getName() + podracers.getPod());
       podracers.introduction();
       Podracers podracers1 = new Podracers("Anakin Skywalker", "Radon-Ulzer 620c turbines");
       podracers1.setName("Sebulba");
       podracers1.setPod("Repulsorcraft with the Collor Pondrat Plug-F Mammoth Split-X engines.");
       podracers1.introduction();
    }
}
//creating another class
class lotr{
    private String name;
    private int age;
    private String location;
    private String interests;


    public lotr(String name, int age, String location, String interests){
        this.name = name;
        this.age = age;
        this.location = location;
        this.interests = interests;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getInterests(){
        return interests;
    }
    public void setInterests(String interests){
        this.interests = interests;
    }
    public void introduction(){
        System.out.println("Here we have " + getName() + ", they are at the ripe age of " + getAge() + ". "  + getName() +   " happily resides in " + getLocation() + " and enjoys " + getInterests() + ".");
    }
    public static void main(String[]args){
        lotr lotr = new lotr("Bilbo", 111,"Hobbiton", "Pipe Smoking");
        System.out.println(lotr.getName()+ lotr.getAge() + lotr.getLocation() + lotr.getInterests());
        lotr.introduction();
        lotr lotr1 = new lotr("Frodo", 50, "Hobbiton", "adventures");
        lotr1.introduction();
        lotr lotr2 = new lotr("Bilbo", 111,"Hobbiton", "Pipe Smoking");
        lotr2.setName("Sam");
        lotr2.setAge(48);
        lotr2.setLocation("Hobbiton");
        lotr2.setInterests("caretaking");
        lotr2.introduction();
    }

}
