package les_16_io_streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDataInputStream {
    public static void main(String[] args) {
        double d=0;
        int k=0;
        boolean b=false;

        try (DataInputStream dis = new DataInputStream(new FileInputStream("fileDataOut.txt"))) {
            d=dis.readDouble();
            k=dis.readInt();
            b=dis.readBoolean();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("d = " + d);
        System.out.println("k = " + k);
        System.out.println("b = " + b);

    }
}
