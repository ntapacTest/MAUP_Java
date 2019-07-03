package les_15_equals_hashcode;

public class Numb {
    int x;

    public Numb(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return new Integer(x).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numb numb = (Numb) o;

        return getX() == numb.getX();

    }

    @Override
    public int hashCode() {
        return getX();
    }
}
