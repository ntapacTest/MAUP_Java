package les_08_abstract;

public class Point2D extends Point1D{
    protected int y;
    public Point2D(String color, int x, int y) {
        super(color, x);
        this.y=y;
    }

    @Override
    public void show() {
        System.out.print("x = " + x);
        System.out.print(", ");
        System.out.println("y = " + y);
    }
}
