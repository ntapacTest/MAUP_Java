package les_08_abstract;

public class Test02 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];

        shapes[0]=new Cube("red",10);
        shapes[1]=new Square("green",10);
        shapes[2]=new Cube("blue",3);

        for (Shape shape : shapes) {
            System.out.println("shape.getArea() = " + shape.getArea());
        }

    }
}
