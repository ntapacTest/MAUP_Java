package les_07_inheritance;

public class TestShape {

    public static void main(String[] args) {
        Shape[] shapeArray=new Shape[6];
        shapeArray[0]=new Circle("red",10);
        shapeArray[1]=new Square("white",5);
        shapeArray[2]=new Rectangle("green",10,20);
        shapeArray[3]=new Circle("violet",15);
        shapeArray[4]=new Rectangle("blue",40,30);
        shapeArray[5]=new Circle();

        for (Shape shape : shapeArray) {
            System.out.println("shape = " + shape);
        }
    }
}
