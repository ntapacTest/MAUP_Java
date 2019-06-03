package les_07_inheritance;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius=radius;
    }

    public Circle(){
        this("black",5);
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return super.toString().replace("Shape", "Circle");

    }
}
