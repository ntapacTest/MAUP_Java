package les_13_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100));
        }

        list.set(5,999);
        list.set(7,999);
        list.set(8,777);
        list.set(9,777);

        System.out.println("list = " + list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        // remove all 999
        iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next()==999) iterator.remove();
        }

        System.out.println("list = " + list);

        // remove all 777
        list.removeIf(x->x==777);
        System.out.println("list = " + list);

    }
}
