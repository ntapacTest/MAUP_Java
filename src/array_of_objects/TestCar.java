package array_of_objects;

public class TestCar {
    public static void main(String[] args) {
        Car[] carArray = new Car[5];

        carArray[0] = new Car(2000, "car1", "black");
        carArray[1] = new Car(2001, "car2", "white");
        carArray[2] = new Car(2012, "car3", "green");
        carArray[3] = new Car(2003, "car4", "red");
        carArray[4] = new Car(1990, "car5", "yellow");
        for (Car car : carArray) {
            System.out.println(car.toString());
        }

        System.out.println("averageAge(carArray) = " + averageAge(carArray));

        System.out.println("maxAge(carArray) = " + maxAge(carArray));

        System.out.println("getOldestCar(carArray) = " + getOldestCar(carArray));

        CarArray carArrayObject=new CarArray(5);
        carArrayObject.addCar(new Car(2000, "car1", "black"));
        carArrayObject.addCar(new Car(2001, "car2", "white"));
        carArrayObject.addCar(new Car(2012, "car3", "green"));
        carArrayObject.addCar(new Car(2003, "car4", "red"));
        carArrayObject.addCar(new Car(1990, "car5", "yellow"));

        System.out.println("averageAge(carArray) = " + carArrayObject.averageAge());

        System.out.println("maxAge(carArray) = " + carArrayObject.maxAge());

        System.out.println("getOldestCar(carArray) = " + carArrayObject.getOldestCar());

        carArrayObject.printAll();


        carArrayObject.delCarByIndex(3);

        carArrayObject.printAll();

        carArrayObject.delCarByIndex(1);

        carArrayObject.printAll();

        carArrayObject.delCarByIndex(5);

        carArrayObject.printAll();

    }

    private static int averageAge(Car[] inData) {
        int result = 0;
        for (int i = 0; i < inData.length; i++) {
            result += inData[i].getAge();
        }
        return result / inData.length;
    }

    private static int maxAge(Car[] inData) {
//        int maxAge = 0;
//        for (Car car : inData) {
//            int currentAge = car.getAge();
//            if (maxAge < currentAge) maxAge = currentAge;
//            //maxAge=maxAge<currentAge?currentAge:maxAge;
//        }
        return getOldestCar(inData).getAge();
    }

    private static Car getOldestCar(Car[] inData){
        Car oldestCar = null;
        for (Car car : inData) {
            int currentAge = car.getAge();
            int oldestCarAge=oldestCar==null?0:oldestCar.getAge();
            if (oldestCarAge < currentAge) oldestCar = car;
            //maxAge=maxAge<currentAge?currentAge:maxAge;
        }
        return oldestCar;
    }
}
