package garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class Garage {
    private Car[] cars;
    private int index;

    public Garage(int n) {
        this.cars = new Car[n];
        this.index = -1;
    }

    public void addCar(Car c){
        if (index == cars.length -1) {
            System.out.println("no places!!");
            return;
        }
        cars[++index] = c;
    }


    public void deleteCarByIndex(int ind){
        if (ind > index || ind < 0 ) {
            System.out.println("Index out of range! " + ind);
            return;
        }
        cars[ind] = cars[index];
        cars[index] = null;
        index--;
    }


    public void print(){
        System.out.println("Garage: ");
        for (Car car : cars) {
            if (car == null) break;
            System.out.println(car);
        }
    }

    public Car[] getCarsOlderThan(int year){

        return filterList2(r->r.getYear()>=year);
    }

    public Car[] getCarsContains(String str){
        return filterList2(r->!r.getName().toUpperCase().contains(str.toUpperCase()));
    }

    private Car[] filterList(Predicate<Car> pr){
        ArrayList<Car> carsArray=new ArrayList<Car>(Arrays.asList(cars).subList(0,index+1));
        carsArray.removeIf(pr);
        return carsArray.toArray(new Car[0]);


    }

    private Car[] filterList2(Predicate<Car> pr){
        ArrayList<Car> carsArray=new ArrayList<Car>(index+1);
        for (int i = 0; i < index+1; i++) {
            if(!pr.test(cars[i])){
                carsArray.add(cars[i]);
            }
        }
        return carsArray.toArray(new Car[0]);
    }
}
