package les_05_methods;

import java.util.Scanner;

public class Home01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input height:");
        int height=scanner.nextInt();

        System.out.println("Input width:");
        int width=scanner.nextInt();

        Rectangle rect=new Rectangle(height,width);

        rect.print();
    }
}
