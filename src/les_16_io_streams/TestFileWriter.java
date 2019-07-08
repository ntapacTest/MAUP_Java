package les_16_io_streams;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {

        String s="Hello, java world";
        String sNull=null;

        try (FileWriter fw = new FileWriter("fileStringOut.txt",false)) {

            fw.write(s);

            // fw.write(sNull); // exception

            fw.append("!!!");

            fw.write("\n");

            fw.write("Test\n");

            fw.write("Line3");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
