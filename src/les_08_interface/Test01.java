package les_08_interface;

public class Test01 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        IAdd calc1=new Calculator();
        IMultiply calc2=new Calculator();
        IArithmetic calc3=new Calculator();
        IInfo calc4=new Calculator();

        calc.info();

        System.out.println("div = " + calc.div(9,3));

    }
}
