package les_13_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSubList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("list = " + list);

        List<Integer> subList = list.subList(3, 7); // THIS IS NOT A COPY
        System.out.println("subList = " + subList);

        subList.set(0,999); // change source list
        System.out.println("subList = " + subList);
        System.out.println("list = " + list);


        // REAL EXAMPLE 1
        list.subList(2,5).clear();
        //System.out.println("subList = " + subList);
        System.out.println("list = " + list);

        // REAL EXAMPLE IF WE NEED COPY
        ArrayList<Integer> subCopy=new ArrayList<>(list.subList(1,3));
        System.out.println("subCopy = " + subCopy);
    }
}
