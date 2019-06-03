package inheritance_and_casting;

public class Test {
    public static void main(String[] args) {
        Worker worker1=new Worker("Jone",100);
        Worker manager=new Manager("Jim",150,50);

        System.out.println("worker1 = " + worker1);
        System.out.println("manager = " + manager);
    }
}
