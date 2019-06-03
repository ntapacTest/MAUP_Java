package les_07_inheritance;

public class Rectangle extends Shape{
    protected int sideA;
    protected int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public String toString() {

        return super.toString().replace("Shape", "Rectangle");

    }
}
