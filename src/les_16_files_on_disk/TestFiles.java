package les_16_files_on_disk;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class TestFiles {
    public static void main(String[] args) throws IOException {

        // Does not create file
        File file=new File("test.txt");
        System.out.println(file.exists());

        File file1=new File("test.txt");
        file1.createNewFile();
        System.out.println(file1.exists());

        System.out.println(file1.lastModified());

        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());

        // Get list of files in directory
        File dir=new File("c:\\Test_8\\MAUP_Java\\");
        File[] files = dir.listFiles();

        for (File file2 : files) {
            System.out.println("file2 = " + file2.getName());
        }

        // Get list of TXT files in directory
        File[] filesTXT = dir.listFiles(f -> f.getName().toUpperCase().endsWith("TXT"));

        for (File txt : filesTXT) {
            System.out.println("txt = " + txt.getName());
        }

        // Since Java 7 can use class Files

        Files.deleteIfExists(Paths.get("testFiles.txt"));

        Files.createFile(Paths.get("testFiles.txt"));
        System.out.println(Files.exists(Paths.get("testFiles.txt")));

        Files.deleteIfExists(Paths.get("testFiles.txt"));
        System.out.println(Files.exists(Paths.get("testFiles.txt")));


    }
}
