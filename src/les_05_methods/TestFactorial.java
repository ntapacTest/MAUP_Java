package les_05_methods;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        int number=scanner.nextInt();

        int result=factorial(number);

        System.out.println("result = " + result);
    }


    private static int factorial(int inData)
    {
        int result=1;
        for (int i = 2; i <= inData; i++) {
            result *=i;
        }

        return result;
    }
}
