package HomeWorkThreads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestHomeWorkThread {
    public static void main(String[] args) throws IOException {

        Files.deleteIfExists(Paths.get("shapeInfo.txt"));

        for (int i = 3; i < 19; i++) {
            new AreaCounterThread(new Circle(i)).start();
            new AreaCounterThread(new Square(i)).start();
        }
    }
}
