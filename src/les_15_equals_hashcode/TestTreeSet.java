package les_15_equals_hashcode;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Person> set=new TreeSet<>((p1, p2) -> {
            if(p1.getName().equals(p2.getName())){
                return Integer.compare(p1.getAge(),p2.getAge());
            }
            return p1.getName().compareTo(p2.getName());
        });
        set.add(new Person("Tom",22));
        set.add(new Person("Tom",23));

        System.out.println("set = " + set);
    }
}
