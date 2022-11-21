package shapes;
import java.util.Scanner;
import util.Input;
public class Rectangle {
    Scanner in = new Scanner(System.in);
    Input input = new Input();
    protected int length;
    protected int width;

    public Rectangle(int lengths, int widths){
        this.length = lengths;
        this.width = widths;
    }
    public int getLengths(){
        return length;
    }
    public int getWidths(){
        return width;
    }
    public void setLengths(int lengths){
        this.length = lengths;
    }
    public void setWidths(int widths){
        this.width = widths;
    }
    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }
    public int getArea(){
        return length * width;

    }
}
