package les_17_multithread;

import java.util.Arrays;

public class TestThreadStates {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(new MyTask("now"));

        System.out.println(t1.getState());

        t1.start();

        System.out.println(t1.getState());

        Thread.sleep(3000);

        System.out.println(t1.getState());

        // Current thread state
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));

    }
}
