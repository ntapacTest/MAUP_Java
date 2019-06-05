package les_08_abstract;

public class Square extends Shape2D {
    protected int side;
    public Square(String color,int side) {
        super(color);
        this.side=side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
