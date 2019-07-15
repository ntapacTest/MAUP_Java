package les_18_inner_nested_anonymous;

public class Car {
    private String name;
    private Engine engine;
    static int maxSpeed = 455;

    public Car() {
    }

    public Car(String name, int enginePower) {
        this.name = name;
        this.engine = new Engine(enginePower);
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void MyMethod(){
        System.out.println("Car my method");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine.name +", "+engine.power+   // access to fields of INNER class !!!
                '}';
    }

    class Engine { //inner class}
        private int power;
        private String name;
        public Engine(int power) {
            this.name="My Engine";
            this.power = power;
        }

        void printName(){
            System.out.println("name = " + name);
            System.out.println("Car.this.name = " + Car.this.name); // how to get fields or methods
                                                                    // of enclosing class

        }

    }

    static class Info {
        int x;
        void printInfo(){
            System.out.println("x = " + x);
            System.out.println(maxSpeed);       // value from Car
            System.out.println(Car.maxSpeed);   // value from Car
        }
    }
}
