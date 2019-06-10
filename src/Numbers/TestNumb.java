package Numbers;

public class TestNumb {
    public static void main(String[] args) {
        Numb x=new Numb(8);
        Numb y=new Numb(6);
        Numb z=new Numb(4);

        Numb r=new Numb(5);
// 8*(6-4)+5
        Numb result=  y.minus(z).multiple(x).plus(r);

        System.out.println("result = " + result);

    }
}
