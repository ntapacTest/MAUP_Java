package les_08_interface;

public class Calculator implements IArithmetic,IInfo {
    @Override
    public double plus(double x, double y) {
        return x+y;
    }

    @Override
    public double minus(double x, double y) {
        return x-y;
    }

    @Override
    public double multiply(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y;
    }
}
