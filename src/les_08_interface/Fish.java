package les_08_interface;

public abstract class Fish extends Animal implements ICanSwim {
    public Fish(String name) {
        super(name);
    }
}
