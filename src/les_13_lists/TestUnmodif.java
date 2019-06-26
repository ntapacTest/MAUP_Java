package les_13_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestUnmodif {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        List<Integer> unmodList = Collections.unmodifiableList(list);
        // unmodList.set(2,999); can not set value

        list.set(2,999);
        System.out.println("unmodList = " + unmodList);

        List<Integer> realUnmodList = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("realUnmodList = " + realUnmodList);

        // realUnmodList.sort(null); // error
    }
}
