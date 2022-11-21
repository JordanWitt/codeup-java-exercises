import java.util.Scanner;

import shapes.Measurable;
import shapes.Rectangle;
import shapes.Square;
public class ShapesTest {
    public static void main(String[]args){
        Rectangle rectangle = new Rectangle(3,7);
        Square square = new Square(8);
        Rectangle rectangle2 = new Rectangle(5, 9);


        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLengths());
        System.out.println(rectangle.getWidths());


        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        rectangle2.setLengths(8);
        rectangle2.setWidths(4);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Measurable myShape =  new Rectangle(9,7);
        Measurable myShape2 = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

    }
}
