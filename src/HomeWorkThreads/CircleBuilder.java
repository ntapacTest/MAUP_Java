package HomeWorkThreads;

public class CircleBuilder implements IShapeBuilder {
    @Override
    public Shape createShape(int value) {
        return new Circle(value);
    }
}
