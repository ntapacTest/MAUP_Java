package les_08_abstract;

public abstract class Shape3D extends Shape{
    protected Shape3D(String color) {
        super(color);
    }
    public abstract int volume();
}
