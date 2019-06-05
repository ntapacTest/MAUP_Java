package les_08_interface;

public class FlyFish extends Fish implements ICanFly{
    public FlyFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Swim flyfish");
    }

    @Override
    public void eat() {
        System.out.println("Eat sea grass");
    }

    @Override
    public void fly() {
        System.out.println("Fly fish");
    }
}
