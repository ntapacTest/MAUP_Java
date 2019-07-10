package les_17_synchro;

public class CounterThread extends Thread {
    private MyCounter counter;

    public CounterThread(MyCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incValue();
        }
    }
}
