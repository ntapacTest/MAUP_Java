package les_06_oop_start;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1=new Triangle(3,4,5);

        int perimeter=t1.getPerimeter();
        System.out.println("perimeter = " + perimeter);
        System.out.println("t1_right = " + t1.isRight());
        System.out.println("t1_rb = " + t1.isRB());

        double area=t1.getArea();
        System.out.println("area = " + area);

        Triangle t2=new Triangle(6,8,10);
        int perimeter2=t2.getPerimeter();
        System.out.println("perimeter2 = " + perimeter2);

        double area2=t2.getArea();
        System.out.println("area2 = " + area2);

        Triangle t_e1=new Triangle(6,80,10);

        Triangle t_right=new Triangle(5,5,5);
        System.out.println("t_right = " + t_right.isRight());
        System.out.println("t_right_rb = " + t_right.isRB());

        Triangle t_rb=new Triangle(5,5,7);
        System.out.println("t_rb_right = " + t_rb.isRight());
        System.out.println("t_rb = " + t_rb.isRB());

    }
}
