package les_17_multithread;

public class TestMultiThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new MyThread1();
        Thread t2=new MyThread2();
        Thread t3=new Thread(() -> System.out.println("now"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);

        System.out.println("end"); // Main thread TERMINATED

    }
}
