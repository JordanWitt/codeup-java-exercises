package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        int attempt = 0;
        int runthroughs = 5;
        boolean running = true;
        boolean goAgain = input.yesNo();

        System.out.println("\t\t\t\t\tLet's make a circle");
        System.out.println();

        CIRCLEGAME:
        while (running) {
            while (runthroughs > 1) {
                if (goAgain == false) {
                    break;
                } else if (goAgain == true) {
                    runthroughs--;
                    System.out.println("You have " + runthroughs + " more circles to make");
                    double getCircleInfo = input.getDouble();
                    Circle circle = new Circle(getCircleInfo);
                    System.out.printf("The area of the circle: " + circle.getAread());
                    System.out.printf("The circumference of the circle: " + circle.getCircumference() + "\n");
                    attempt++;
                    if(runthroughs <= 1){
                        System.out.println("Thanks for playing");
                        System.out.println("here's the number of circles made: " + attempt);
                        System.out.println("Do you want to play again: ");
                    }if(goAgain == true){
                        continue CIRCLEGAME;
                    }else{
                        break;
                    }
                }
            }System.out.println("Thanks for playing. You had " + attempt + " attempts.");
            break;
        }
    }
}