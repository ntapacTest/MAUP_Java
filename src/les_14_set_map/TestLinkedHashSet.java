package les_14_set_map;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> set=getIntArra(10);

        System.out.println("set = " + set);
    }

    private static Set<Integer> getIntArra(int numCount){
        Set<Integer> result=new LinkedHashSet();

        while (result.size()<numCount){
            int num=(int)(Math.random()*numCount)+1;
            result.add(num);
        }

        return result;
    }
}
