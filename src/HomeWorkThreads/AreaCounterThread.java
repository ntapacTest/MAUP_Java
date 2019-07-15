package HomeWorkThreads;

public class AreaCounterThread extends Thread {

    Shape shape;

    public AreaCounterThread(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void run() {

        shape.writeInfoToFS();
    }
}
