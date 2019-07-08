package les_16_io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestBufferedReader {
    public static void main(String[] args) {
        List<String> lines=new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("fileStringOut.txt"))) {

            // lines:
            String line;
            while ((line=br.readLine())!=null){

                lines.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
