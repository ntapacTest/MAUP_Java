package les_12_exceptions;

import java.util.Scanner;

public class Task_2{
    public static void main(String[] args) {
        int a=inputNumber("a");
        int b=inputNumber("b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static int inputNumber(String varName){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input " + varName+":");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }
}
