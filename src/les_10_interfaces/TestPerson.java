package les_10_interfaces;

import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {
        Person[] people=new Person[5];

        people[0]=new Person("AName1",20);
        people[1]=new Person("CName2",38);
        people[2]=new Person("RName3",20);
        people[3]=new Person("LName4",35);
        people[4]=new Person("FName5",34);

        //Arrays.sort(people,(o1, o2) ->Integer.compare(o1.getAge(),o2.getAge()));

        Arrays.sort(people,new PersonByAgeComparator().thenComparing(new PersonByNameComparator().reversed()));

        //Arrays.sort(people,new PersonByNameComparator());

        System.out.println("people = " + Arrays.toString(people));
    }
}
