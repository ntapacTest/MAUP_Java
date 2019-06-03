package array_of_objects;

public class CarArray{
    private Car[] carArray;
    private int index;

    public CarArray(int carCount) {
        this.carArray = new Car[carCount];
        index=-1;
    }

    public void addCar(Car car){
        if(index==carArray.length-1){
            System.out.println("Car array is full");
            return;
        }
        carArray[++index]=car;
    }

    public void delCarByIndex(int delIndex){
        if(delIndex>index||delIndex<0){
            System.out.println("Index out of range");
            return;
        }
        carArray[delIndex]=carArray[index];
        carArray[index]=null;
        index--;
    }


    public int averageAge() {
        int result = 0;
        for (int i = 0; i < carArray.length; i++) {
            result += carArray[i].getAge();
        }
        return result / carArray.length;
    }

    public int maxAge() {

        return getOldestCar().getAge();
    }

    public Car getOldestCar(){
        Car oldestCar = null;
        for (Car car : carArray) {
            int currentAge = car.getAge();
            int oldestCarAge=oldestCar==null?0:oldestCar.getAge();
            if (oldestCarAge < currentAge) oldestCar = car;
            //maxAge=maxAge<currentAge?currentAge:maxAge;
        }
        return oldestCar;
    }

    public void printAll(){
        System.out.println("-----------------------------------");
        for (Car car : carArray) {
            //if(car==null)break;
            if(car!=null)System.out.println("car = " + car);
            //System.out.println("car = " + car);
        }
    }
}
