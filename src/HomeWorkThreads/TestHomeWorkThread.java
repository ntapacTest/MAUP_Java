package HomeWorkThreads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestHomeWorkThread {
    public static void main(String[] args) throws IOException {

        Files.deleteIfExists(Paths.get("shapeInfo.txt"));
        int[] values={3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        new AreaCounterThread(new CircleBuilder(),values).start();
        new AreaCounterThread(new SquareBuilder(),values).start();
    }

}
