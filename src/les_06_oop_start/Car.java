package les_06_oop_start;


public class Car {
    private String name;
    private int year;
    private double speed;

    public Car(){
        speed=0;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    public void accelerate(double delta){
        if(delta<0)return;
        speed+=delta;
    }

    public void decelerate(double delta){
        if(delta<0)return;
        speed-=delta;
        if(speed<0)speed=0;
    }

    public void print(){
        System.out.println("name = " + name);
        System.out.println("year = " + year);
        System.out.println("speed = " + speed);
        System.out.println("-------------------");
    }
}
