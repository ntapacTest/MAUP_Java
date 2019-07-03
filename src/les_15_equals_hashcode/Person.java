package les_15_equals_hashcode;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getName().equals(person.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        return result;
    }

//    @Override
//    public int compareTo(Person other) {
////        if(this.age>other.age) return 1;
////        if(this.age<other.age) return -1;
////        if(this.age==other.age) return 0;
//        return this.name.compareTo(other.getName());
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Person that=(Person)obj;
//        return this.getAge()==that.age&&this.name.equals(that.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode()+age;
//    }
}
