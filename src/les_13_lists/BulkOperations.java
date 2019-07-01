package les_13_lists;

import java.util.ArrayList;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list_a = new ArrayList<>();
        list_a.add(100);
        list_a.add(101);
        list_a.add(102);
        list_a.add(103);
        list_a.add(104);
        list_a.add(105);
        list_a.add(106);
        list_a.add(107);
        list_a.add(108);
        list_a.add(109);

        ArrayList<Integer> list_b = new ArrayList<>();
        list_b.add(105);
        list_b.add(106);
        list_b.add(107);
        list_b.add(108);
        list_b.add(109);
        list_b.add(109);
        list_b.add(110);
        list_b.add(111);
        list_b.add(112);


        // 1. A+B addAll
        ArrayList<Integer> list_add = new ArrayList<>(list_a);
        list_add.addAll(list_b);
        System.out.println("list_add = " + list_add);
        System.out.println("list_a = " + list_a);
        System.out.println("list_b = " + list_b);

        // 2. A\B removeAll delete all items in list_a which contains in list_b
        ArrayList<Integer> list_dell = new ArrayList<>(list_a);
        list_dell.removeAll(list_b);
        System.out.println("list_dell = " + list_dell);
        System.out.println("list_a = " + list_a);
        System.out.println("list_b = " + list_b);

        // 3. A intersect B retainAll leave all items in list_a which contains in list_b
        ArrayList<Integer> list_inter = new ArrayList<>(list_a);
        list_inter.retainAll(list_b);
        System.out.println("list_inter = " + list_inter);
        System.out.println("list_a = " + list_a);
        System.out.println("list_b = " + list_b);

        // 4. containsAll
        boolean b = list_a.containsAll(list_b);
        System.out.println("b = " + b);

    }
}
