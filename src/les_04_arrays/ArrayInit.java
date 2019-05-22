package les_04_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {

        // 1
        int [] a=new int[10];

        // 2
        int [] b={1,2,3,4,5,6,7};

        // 3
        int [] c;
        c= new int[]{1, 2, 3, 4, 5};

        System.out.println("a = " + a);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
    }
}
