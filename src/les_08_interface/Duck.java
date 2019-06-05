package les_08_interface;

public class Duck extends Bird {
    boolean isDomestic;

    public Duck(String name,boolean isDomestic) {
        super(name);
        this.isDomestic=isDomestic;
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void eat() {
        System.out.println("Eat grass");
    }
}
