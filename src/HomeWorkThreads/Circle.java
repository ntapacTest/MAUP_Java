package HomeWorkThreads;

public class Circle extends Shape {

    public Circle(int radius) {
        super("Circle",radius);
    }

    @Override
    public synchronized double getArea()  {
        return Math.PI*value*value;
    }
}
