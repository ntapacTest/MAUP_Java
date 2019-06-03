package les_07_inheritance;

public abstract class Shape {

    protected String color;
    public abstract double area();
    public abstract double perimeter();

    protected Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + "\', " +
                "area='"+area()+"\', "+
                "perimeter='"+perimeter()+"\'"+
                '}';
    }
}
