package les_17_synchro;

public class TestSynchro {
    public static void main(String[] args) throws InterruptedException {

        MyCounter counter=new MyCounter();

        for (int i = 0; i < 200; i++) {

            new CounterThread(counter).start();
        }

        Thread.sleep(5000);
        System.out.println("counter = " + counter.getValue());

        Thread.sleep(1000);
        System.out.println("counter = " + counter.getValue());
    }
}
