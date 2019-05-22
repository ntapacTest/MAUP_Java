package les_04_arrays;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int n=4;
        int[][] a=initNArray(n);
        a=initNArray(n);
        System.out.println("a = " + Arrays.deepToString(a));

        printNArray(a);
    }

    private static int[][] initNArray(int n)
    {
        int[][]result=new int[n][];

        int currentNumber=0;
        for (int i = 0; i < n; i++) {
            result[i]=new int[i+1];
            for (int j = 0; j < i+1 ; j++) {
                result[i][j]=currentNumber;
                currentNumber++;
            }
        }
        return result;
    }

    private static void printNArray(int[][] inArray)
    {
        for (int i = 0; i < inArray.length; i++) {
            for (int j = 0; j < inArray[i].length; j++) {
                System.out.print(inArray[i][j]);
            }
            System.out.println();
        }
    }
}
