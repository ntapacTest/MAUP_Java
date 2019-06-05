package les_08_interface;

public class Pinguin extends Bird implements ICanSwim
{
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eat fish");
    }

    @Override
    public void fly() {
        //System.out.println("Oops...");
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Fly under water");
    }
}
