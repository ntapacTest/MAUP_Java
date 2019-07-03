package les_15_equals_hashcode;


import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<Numb> list1 = createList(30);
        ArrayList<Numb> list2 = createList(30);
        ArrayList<Numb> list3 = new ArrayList<>(list1);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list3.addAll(list2);
        System.out.println("list3 = " + list3);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        System.out.println("list3 = " + list3);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }

    private static ArrayList<Numb> createList(int numItems){
        ArrayList<Numb> result=new ArrayList<>(numItems);

        for (int i = 0; i < numItems; i++) {
            result.add(new Numb((int)( Math.random()*numItems)));
        }
        return result;
    }
}
