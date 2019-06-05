package les_08_interface;

public class Test02 {
    public static void main(String[] args) {
        Animal a1 = new Shark("shark", 100);
        Animal a2 = new Duck("duck1", true);
        Animal a3 = new Duck("duck2", false);
        Animal a4 = new FlyFish("flyfish");
        Animal a5=new Pinguin("pin");

        ICanFly[] f1 = new ICanFly[3];
        f1[0] = (ICanFly) a2;
        f1[1] = (ICanFly) a3;
        f1[2] = (ICanFly) a4;

        Animal[] a=new Animal[5];
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        a[3]=a4;
        a[4]=a5;

        Bird[] b=new Bird[3];
        b[0]=(Bird) a2;
        b[1]=(Bird) a3;
        b[2]=(Bird) a5;

        ICanSwim[] s=new ICanSwim[3];
        s[0]=(ICanSwim)a1;
        s[1]=(ICanSwim)a4;
        s[2]=(ICanSwim)a5;

        makeThemFly(b);

        //makeThemAllEat(a);

        //makeThemAllEat(b); // !!!!!!!!!!!!!!!

        //makeThemFly(f1);

        //makeThemSwim(s);
    }

    public static void makeThemAllEat(Animal[] inData) {
        for (Animal animal : inData) {
            animal.eat();
        }
    }

    public static void makeThemFly(ICanFly[] inData) {
        for (ICanFly f : inData) {
            f.fly();
        }
    }

    public static void makeThemSwim(ICanSwim[] inData){
        for (ICanSwim s : inData) {
            s.swim();
        }
    }
}
