package les_13_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayToList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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

        // 1. list -> array
        Object[] objArray=list.toArray();
        System.out.println("objArray = " + Arrays.toString(objArray));

        // 2.1 list->array
        Integer[] intArray1 = list.toArray(new Integer[list.size()]);
        System.out.println("intArray1 = " + Arrays.toString(intArray1));

        // 2.2 list->array
        Integer[] intArray2 = list.toArray(new Integer[list.size()+10]);
        System.out.println("intArray2 = " + Arrays.toString(intArray2));

        // 2.3 list->array
        Integer[] intArray3 = list.toArray(new Integer[list.size()-4]);
        System.out.println("intArray3 = " + Arrays.toString(intArray3));

        // 2.4 Short way list->array
        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println("intArray = " + Arrays.toString(intArray));

        // array -> list
        // обертка над массивом
        // можно менять содержимое, нельзя добавлять-удалать
        List<Integer> list1 = Arrays.asList(intArray);

        list1.set(0,999); // Ok
        System.out.println("list1 = " + list1);

        // error
        // list1.add(new Integer(3));

        // Real ArrayList
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(intArray));
        list2.add(188);
        list2.remove(Integer.valueOf(102));
        System.out.println("list2 = " + list2);
    }
}
