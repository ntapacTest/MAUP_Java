package Numbers;

public interface IAddable<T> {
    T plus(T inData);
    T minus(T inData);
    T plus(double inX);
    T minus(double inX);
}
