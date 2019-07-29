package les_22_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPI {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Tom", 22));
        people.add(new Person("Anna", 18));
        people.add(new Person("Nik", 28));
        people.add(new Person("Don", 28));
        people.add(new Person("Zorro", 35));
        people.add(new Person("Dean", 18));

        // 0. not need stream
        System.out.println("All people:");
        people.forEach(s -> System.out.println(s));
        // or
        //people.forEach(System.out::println);

        // 1.
        System.out.println("Count all people:");
        System.out.println(people.stream().count());

        // 2.
        System.out.println("Print people > 21 year:");
        people.stream()
                .filter(p -> p.getAge() > 21)
                .forEach(p -> System.out.println(p));

        // 3.
        System.out.println("List of names people >21:");

        List<String> people21 = people.stream()
                .filter(p -> p.getAge() > 21)
                .map(p -> p.getName())
                .collect(Collectors.toList());

        people21.forEach(System.out::println);

        // 4.1
        System.out.print("Max age: ");
        System.out.println(people.stream()
                .map(p -> p.getAge())
                .reduce((x, y) -> Math.max(x, y))
                .get());

        // 4.2
        System.out.print("Max age v2: ");
        System.out.println(people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).get()
                .getAge());
        // or
//        System.out.println(people.stream()
//                .max(Comparator.comparingInt(Person::getAge)).get()
//                .getAge());

        // 5
        System.out.println("Person with max age: ");
        System.out.println(people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).get());

        // 5.2
        System.out.println("Person with min age: ");
        System.out.println(people.stream()
                .min((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).get());

        // 6 combined
        System.out.println("Age>21 and name contains 'o'");
        people.stream()
                .filter(p->p.getAge()>21
                        &&p.getName().contains("o"))
                .forEach(System.out::println);
        // or
        people.stream()
                .filter(p->p.getAge()>21)
                .filter(p->p.getName().contains("o"))
                .sorted((p1,p2)->-p1.getName().compareTo(p2.getName())) // add "-" to sort desc
                .forEach(System.out::println);

        // 7
        System.out.println("Print list names with age > 50");
        people.stream()
                .filter(p->p.getAge()>50)
                .map(p->p.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 8
        System.out.println("Print first name strart with 'C'");
        System.out.println(people.stream()
                .filter(p -> p.getName().startsWith("C"))
                .findFirst().orElse(null));

        System.out.println(people.stream()
                .filter(p -> p.getName().startsWith("C"))
                .findFirst().orElseGet(()->null));

    }
}
