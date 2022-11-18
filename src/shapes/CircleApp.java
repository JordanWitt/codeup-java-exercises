package shapes;

import util.Input;

import java.util.Scanner;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        int attempt = 1;
        boolean running = true;

        System.out.println("Let's create a circle, enter a number to generate area and circumference: ");

        CIRCLEGAME:
        while (running) {
            double getCircleInfo = input.getDouble();
            Circle circle = new Circle(getCircleInfo);
            System.out.println("The area of the circle: " + circle.getAread());
            System.out.println("The circumference of the circle: " + circle.getCircumference());
        }
    }
}

