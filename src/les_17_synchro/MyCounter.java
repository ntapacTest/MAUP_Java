package les_17_synchro;

public class MyCounter {
    private long value;

    public synchronized void incValue()
    {
        value++;
    }

    public long getValue() {
        return value;
    }
}
