package les_08_abstract;

public class Cube extends Shape3D {
    protected int side;

    protected Cube(String color, int side) {
        super(color);
        this.side=side;
    }

    @Override
    public int volume() {
        return side*side*side;
    }

    @Override
    public int getArea() {
        return side*side*6;
    }
}
