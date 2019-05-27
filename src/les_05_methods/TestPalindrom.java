package les_05_methods;

import java.util.Scanner;

public class TestPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        int number=scanner.nextInt();

        boolean result=isPalindrom(number);

        System.out.println("result = " + result);

        boolean result2=isPalindrom2(number);

        System.out.println("result2 = " + result2);


    }

    static Boolean isPalindrom(int inData){
        char[] inCharArray=Integer.toString(inData).toCharArray();

        boolean result=true;
        int i=0;
        while (result){
            if(i<inCharArray.length/2) {
                result = inCharArray[i] == inCharArray[inCharArray.length - i-1];
                i++;
            }else{
                return true;
            }
        }
        return result;
    }

    static Boolean isPalindrom2(int inData){
        char[] inCharArray=Integer.toString(inData).toCharArray();

        int count=inCharArray.length/2;
        for (int i = 0; i < count; i++) {
            if(inCharArray[i]!=inCharArray[inCharArray.length-1-i]) return false;
        }
        return true;
    }

}
