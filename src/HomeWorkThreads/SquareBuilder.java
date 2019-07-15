package HomeWorkThreads;

public class SquareBuilder implements IShapeBuilder{


    @Override
    public Shape createShape(int value) {
        return new Square(value);
    }
}
