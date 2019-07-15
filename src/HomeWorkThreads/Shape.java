package HomeWorkThreads;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Shape implements IGetArea {
    String shapeName;

    protected int value;

    public Shape(String shapeName, int value) {
        this.shapeName = shapeName;
        this.value = value;
    }

    public synchronized void writeInfoToFS(){
        System.out.println(shapeName+" "+value+" "+getArea());
        try (FileWriter fw = new FileWriter("shapeInfo.txt",true)) {

            fw.write(shapeName+" "+value+" "+getArea()+"\r\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
