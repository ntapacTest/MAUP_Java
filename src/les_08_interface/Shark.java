package les_08_interface;

public class Shark extends Fish {

    int countTeeeth;

    public Shark(String name, int countTeeeth) {
        super(name);
        this.countTeeeth=countTeeeth;
    }

    @Override
    public void swim() {
        System.out.println("Shark swim");;
    }

    @Override
    public void eat() {
        System.out.println("Eat meat");
    }


}
