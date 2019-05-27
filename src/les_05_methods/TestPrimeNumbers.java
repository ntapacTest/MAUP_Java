package les_05_methods;

import java.util.Scanner;

public class TestPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        int number=scanner.nextInt();

        Boolean result=isPrimeNumber(number);

        System.out.println("result = " + result);
    }

    public static Boolean isPrimeNumber(int inData){
        int count=0;
        if(inData%2==0) return false;

        for (int i = 3; i <=(int)Math.sqrt(inData) ; i+=2) {
            System.out.println("i = " + i);
            count++;
            if(inData%i==0){
                System.out.println("count = " + count);
                return false;
            }
        }
        System.out.println("count = " + count);
        return true;
    }

}
