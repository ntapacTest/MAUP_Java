package les_17_multithread;

public class MyTask implements Runnable {

    String s;

    public MyTask(String text) {
        this.s = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
