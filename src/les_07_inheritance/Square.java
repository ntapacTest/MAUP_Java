package les_07_inheritance;

public class Square extends Rectangle {
    public Square(String color, int side) {
        super(color,side,side);
    }

    @Override
    public String toString() {
        return super.toString().replace("Rectangle", "Square");

    }
}
