package les_13_lists;

import java.util.ArrayList;

public class TaskLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list1.add((int)(Math.random()*100));
        }
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list2.add((int)(Math.random()*100));
        }
        System.out.println("list2 = " + list2);

        int p=0;
        ArrayList<Integer> list3=new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list3.add(list1.get(i)+list2.get(i));
            p+=list1.get(i)*list2.get(i);
        }
        System.out.println("list3 = " + list3);
        System.out.println("p = " + p);



    }
}
