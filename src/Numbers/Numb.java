package Numbers;

public class Numb implements IAddable<Numb>, IMultiable<Numb>{
    double x;

    public Numb(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return Double.toString(x);
    }

    public double getValue() {
        return this.x;
    }

    @Override
    public Numb plus(Numb inData) {
        return new Numb(this.getValue()+ inData.getValue());
    }

    @Override
    public Numb minus(Numb inData) {
        return new Numb(this.getValue()- inData.getValue());
    }

    @Override
    public Numb multiple(Numb inData) {
        return new Numb(this.getValue()*inData.getValue());
    }

    @Override
    public Numb div(Numb inData) {
        return new Numb(this.getValue()/inData.getValue());
    }

    @Override
    public Numb plus(double inX) {
        return new Numb(this.getValue()+ inX);
    }

    @Override
    public Numb minus(double inX) {
        return new Numb(this.getValue()- inX);
    }

    @Override
    public Numb multiple(double inX) {
        return new Numb(this.getValue()*inX);
    }

    @Override
    public Numb div(double inX) {
        return new Numb(this.getValue()/inX);
    }
}
