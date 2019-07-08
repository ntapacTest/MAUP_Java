package les_16_io_streams;

import javax.management.openmbean.ArrayType;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestFileReader {
    public static void main(String[] args) {
        String s=null;
        StringBuilder sb=new StringBuilder();
        ArrayList<String> lines=new ArrayList<>();

        try (FileReader fr = new FileReader("fileStringOut.txt")) {

            //  low level approach
            int b=0;
            while (true){
                b=fr.read();
                if(b==-1)break;
                sb.append((char) b);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        s=sb.toString();
        System.out.println("s = " + s);
    }
}
