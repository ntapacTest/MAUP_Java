package les_16_io_streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {

        double d=Double.MAX_VALUE;
        int k=1;
        boolean b=true;


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("fileDataOut.txt"))) {
            dos.writeDouble(d);
            dos.writeInt(k);
            dos.writeBoolean(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
