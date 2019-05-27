package les_05_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodChangesInput {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 2, 5, 7, 4, 2, 3};
        int[] a2 = {1, 3, 2, 5, 7, 4, 2, 3};

        sortArray(a1);
        int[] res2=sorted(a2);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("res2 = " + res2);

        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("res2 = " + Arrays.toString(res2));
    }

    static void sortArray(int[] inData) {
        System.out.println("sortArray inData = " + inData);
        Arrays.sort(inData);
    }

    static int[] sorted(int[] inData){
        System.out.println("sorted inData = " + inData);
        int[] result=Arrays.copyOf(inData,inData.length);
        System.out.println("sorted result = " + result);

        Arrays.sort(result);

        return result;
    }

}
