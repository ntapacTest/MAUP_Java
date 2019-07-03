package les_14_set_map;

import java.util.*;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(444);

        System.out.println("set = " + set);

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            System.out.println("iter = " + it.next());
        }

        set.remove(444);
        System.out.println("set = " + set);

        // list -> set (distinct)
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,1,3,4,5,4,3,5,8,7,2,1));
        Set<Integer> set_unique=new HashSet<>(list);
        System.out.println("set_unique = " + set_unique);

    }

}
