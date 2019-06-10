package les_10_interfaces;

import java.util.Comparator;

public class PersonByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()>o2.getAge()) return 1;
        if(o1.getAge()<o2.getAge()) return -1;
        return 0;
    }
}
