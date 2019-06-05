package les_08_abstract;

public abstract class Shape {
    protected String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract int getArea();
}
