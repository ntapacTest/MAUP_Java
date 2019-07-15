package HomeWorkThreads;

public class AreaCounterThread extends Thread {

    private IShapeBuilder shapeBuilder;
    private int[] valuesArray;

    public AreaCounterThread(IShapeBuilder shapeBuilder, int[] valuesArray) {
        this.valuesArray=valuesArray;
        this.shapeBuilder=shapeBuilder;
    }

    @Override
    public void run() {
        for (int i = 0; i < valuesArray.length; i++) {
            shapeBuilder.createShape(i).writeInfoToFS();
        }
    }
}
