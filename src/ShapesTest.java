import java.util.Scanner;
import shapes.Rectangle;
public class ShapesTest {
    public static void main(String[]args){
        Rectangle rectangle = new Rectangle(3,7);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLengths());
        System.out.println(rectangle.getWidths());

        Rectangle rectangle2 = new Rectangle(5, 9);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        rectangle2.setLengths(8);
        rectangle2.setWidths(4);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
    }
}
