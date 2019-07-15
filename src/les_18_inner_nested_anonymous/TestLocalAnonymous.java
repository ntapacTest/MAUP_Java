package les_18_inner_nested_anonymous;

import java.util.Comparator;

public class TestLocalAnonymous {
    public static void main(String[] args) {
        // 1. Anonymous by extends:
        Car car=new Car(){  // new class .. (.. extends Car)
            @Override
            public void MyMethod() {
                super.MyMethod();
                System.out.println("Anonymous class");
            }
        };

        // 2. Anonymous class by implements (Interface)
        //    new class .. (.. implements Comparator<Car>)
        Comparator<Car> comparator=new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getName().compareTo(c2.getName());
            }
        };

        int x=20;

        // local class
        // inside method
        class A{
            int y;

            public A(int y) {
                this.y = y;
            }

            void M(){
                //x=x-5; //ERROR! can not modify external variables
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }
        A a1=new A(10);
        a1.M();

        A a2=new A(20);
        a2.M();
    }
}
