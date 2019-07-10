package les_17_multithread;

public class TestRunnable {
    public static void main(String[] args) {

        Runnable task1=new MyTask("hello!");
        Runnable task2=new MyTask("bye!");

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
