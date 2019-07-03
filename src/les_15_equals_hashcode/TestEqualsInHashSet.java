package les_15_equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestEqualsInHashSet {
    public static void main(String[] args) {
        Person p1=new Person("name",25);
        Person p2=new Person("name",25);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Set<Person> set=new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println("set = " + set);
    }
}
