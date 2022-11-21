package shapes;
public class Rectangle extends Quadrilateral implements Measurable {
    protected int length;
    protected int width;

    public Rectangle(int lengths, int widths){
        super(lengths, widths);
        this.width = widths;
        this.length = lengths;

    }

    @Override
    void setLength(int length) {

    }
    @Override
    void setWidth(int width) {

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
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
    public double getArea(){
        return length * width;

    }
}
