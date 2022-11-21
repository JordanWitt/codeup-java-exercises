package shapes;

public class Square extends Quadrilateral{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public double getPerimeter(){
        return  4 * side;
    }
    @Override
    public double getArea(){
        return side ^ 2;
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }
}
