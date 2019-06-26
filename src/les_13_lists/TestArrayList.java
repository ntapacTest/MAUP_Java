package les_13_lists;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(106);
        list.add(107);
        list.add(108);
        list.add(109);
        System.out.println("list = " + list);

        list.remove("dsdsdsd"); // remove by index invalid type
        System.out.println("list = " + list);

        list.remove(0); // remove by index
        System.out.println("list = " + list);

        list.remove(new Integer(100)); // Remove by object
        System.out.println("list = " + list);

        list.remove((Integer)102);
        System.out.println("list = " + list); // Remove by object

        list.remove(Integer.valueOf(103));
        System.out.println("list = " + list); // Remove by object

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+" - "+list.get(i));
        }

        for (Integer val : list) {
            System.out.print(val+", ");
        }

        System.out.println("list.contains(108) = " + list.contains(108));
        System.out.println("list.contains(string) = " + list.contains("fff"));
        System.out.println("list.contains(TestArrayList) = " + list.contains(new TestArrayList()));

        Integer previous=list.set(2,999);
        System.out.println("previous = " + previous);
        System.out.println("list = " + list);

        // list.set(20,999);    // IndexOutOfBoundsException

    }
}
