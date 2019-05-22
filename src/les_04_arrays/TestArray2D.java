package les_04_arrays;

import java.util.Arrays;

public class TestArray2D {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        System.out.println(Arrays.toString(a));

        int[][] av2=new int[3][0];
        System.out.println(Arrays.toString(av2));

        a[0]=new int[2];

        int[] a1={1,2,3};
        a[1]=Arrays.copyOf(a1,a1.length);

        System.out.println("a = " + Arrays.toString(a));

        a[2]=new int[5];

        a[2][2]=5;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + Arrays.toString(a[i]));
        }

        // Second way to print 2D array
        System.out.println(Arrays.deepToString(a));
    }
}
