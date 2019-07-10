package les_16_io_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Today the");
        list.add("weather");
        list.add("is fine!");

        String inFileName = "taskFileIn.txt";
        String outFileName = "taskFileOut.txt";

        createFile(list, inFileName);

        modifyData(inFileName, outFileName);


    }

    public static void createFile(List<String> lines, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, false)) {

            for (String line : lines) {
                fw.write(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modifyData(String inFileName, String outFileName) {
        // more than one resources in one   try catch block
        try (
                BufferedReader br = new BufferedReader(new FileReader(inFileName));
                FileWriter fr = new FileWriter(outFileName)) {

            // lines:
            String line;
            while ((line = br.readLine()) != null) {
                fr.write(line.toUpperCase() + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
