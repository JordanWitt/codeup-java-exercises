package InheritanceAndPolymorphism;

public class Person {
    protected String name;

    public Person (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void introduction(){
        System.out.println("Hello " + getName());
    }
    public static void main(String[]args){
        Person person = new Person("Jordan");
        person.introduction();
    }
}