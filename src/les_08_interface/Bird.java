package les_08_interface;

public abstract class Bird extends Animal implements ICanFly {
    public Bird(String name) {
        super(name);
    }
}
