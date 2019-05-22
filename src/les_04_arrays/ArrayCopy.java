package les_04_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        // 1
        int[] copy1=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy1[i]=a[i];
        }
        System.out.println("copy1 = " + Arrays.toString(copy1));

        // 2
        int[] copy2=new int[a.length];
        System.arraycopy(a,1,copy2,2,a.length-4);
        System.out.println("copy2 = " + Arrays.toString(copy2));

        // 3
        int[] copy3= Arrays.copyOfRange(a,0,a.length);
        System.out.println("copy3 = " + Arrays.toString(copy3));

    }
}
