package les_18_inner_nested_anonymous;

public class TestInnerNested {
    public static void main(String[] args) {
        Car car=new Car("Car1",200);
        System.out.println("car = " + car);

        //Car.Engine engine=new Car.Engine(100);    //ERROR! can not create instance of INNER (not-static/NESTED) class

        Car.Info info =new Car.Info();              // OK: class is NESTED
        info.printInfo();
    }
}
