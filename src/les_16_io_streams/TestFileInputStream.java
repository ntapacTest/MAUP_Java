package les_16_io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class TestFileInputStream {
    public static void main(String[] args) {
        byte[] data=new byte[4];

        try (InputStream fis = new FileInputStream("fileOut.txt")) {

            // 1 one by one
            for (int i = 0; i < data.length; i++) {
                data[i]=(byte) fis.read();
            }
            System.out.println("data = " + Arrays.toString(data));

            // 2 whole array
            fis.read(data);
            System.out.println("data = " + Arrays.toString(data));

            // must use only one approach first or second
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
