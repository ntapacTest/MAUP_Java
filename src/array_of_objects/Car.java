package array_of_objects;

import java.time.LocalDate;

public class Car {
    int year;
    String name;
    String color;

    public Car(int year, String name, String color) {
        this.year = year;
        this.name = name;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getAge(){
        return LocalDate.now().getYear()-year;
    }
}
