package les_16_io_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileOutputStream {
    public static void main(String[] args) {

        byte[] data={65, 66, 67, 20};

        try (OutputStream fos = new FileOutputStream("fileOut.txt")) {

            // 1 write 1 byte
            fos.write(data[0]);

            // 2 write array of bytes
            fos.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
