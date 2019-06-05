package les_08_interface;

public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("name = " + name);
    }
    public abstract void eat();
}
