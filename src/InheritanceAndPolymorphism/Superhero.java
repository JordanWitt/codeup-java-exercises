package InheritanceAndPolymorphism;

public class Superhero extends Person{
    private String alterEgo;

    public Superhero(String superHeroName, String alterEgoName){
        super(superHeroName);
        this.alterEgo = alterEgoName;
    }
    public String getName(){
        return alterEgo;
    }
    public String getSecretIdentity(){
        System.out.println("Who summoned me: ");
        return super.getName();
    }
    public static void main(String[]args){
        Superhero newHero = new Superhero("Roarshack", "uhhh...Roarshack");
        System.out.println("This is " + newHero.name + " their alter ego is " + newHero.alterEgo);
        System.out.println("this is still " + newHero.alterEgo);
        System.out.println(newHero.getSecretIdentity());

    }
}
