package les_06_oop_start;

public class TestCar {
    public static void main(String[] args) {
        Car car=new Car();
        car.print();
        car.accelerate(5);
        car.print();

        Car car1=new Car("Tesla",2018);

        car1.print();
    }
}
