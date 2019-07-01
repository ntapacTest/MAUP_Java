package garage;

import java.util.Arrays;

public class TestGarage {
    public static void main(String[] args) {

        Garage garage = new Garage(10);

        garage.addCar(new Car("BMW",2010));
        garage.addCar(new Car("KIA",2015));
        garage.addCar(new Car("Mers",2000));
        garage.addCar(new Car("VAZ",1988));

//        garage.print();
//        garage.deleteCarByIndex(1);
//
//        garage.print();

        Car[] carsOlderThan = garage.getCarsOlderThan(2000);
        System.out.println("carsOlderThan = " + Arrays.toString(carsOlderThan));

        Car[] carsContains = garage.getCarsContains("a");
        System.out.println("carsContains = " + Arrays.toString(carsContains));

    }
}
