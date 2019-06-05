package les_08_abstract;

public class Test01 {
    public static void main(String[] args) {
        Point[] points=new Point[3];

        points[0]=new Point1D("red",5);
        points[1]=new Point2D("green",10,15);
        points[2]=new Point2D("blue",3,7);

        for (Point point : points) {
            point.show();
        }
    }
}
