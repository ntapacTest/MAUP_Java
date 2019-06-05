package les_08_abstract;

public abstract class Point {
    protected String color;

    public Point(String color) {
        this.color = color;
    }

    public abstract void show();
}
