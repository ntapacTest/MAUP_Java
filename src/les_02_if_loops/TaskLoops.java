package les_02_if_loops;

import java.util.Scanner;

public class TaskLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        int num = scanner.nextInt();

        int lineCount =  num * 2;
        int starCount = 0;

        for (int i = 0; i < lineCount; i++) {
            //String value = "";
            starCount = (i < num) ? i + 1 : starCount - 1;

            for (int j = 0; j < starCount; j++) {
                //value += "*";
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
