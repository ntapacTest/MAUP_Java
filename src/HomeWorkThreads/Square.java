package HomeWorkThreads;

public class Square extends Shape{

    public Square(int side) {
        super("Square",side);
    }

    @Override
    public synchronized double getArea() {return value*value;}
}
