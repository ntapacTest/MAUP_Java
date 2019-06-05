package les_08_abstract;

public class Point1D extends Point {
    protected int x;

    public Point1D(String color, int x) {
        super(color);
        this.x=x;
    }

    @Override
    public void show() {
        System.out.println("x = " + x);
    }
}
