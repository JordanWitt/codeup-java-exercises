package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getAread(){
        return Math.PI * radius * radius;
    }
    public  double getCircumference(){
        return 2 * Math.PI * radius;
    }

}
