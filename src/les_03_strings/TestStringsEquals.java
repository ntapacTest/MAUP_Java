package les_03_strings;

public class TestStringsEquals {
    public static void main(String[] args) {
        String s1=new String("java"); // first memory address
        String s2=new String("java"); // second memory address

        String s3="java"; // third memory address
        String s4="java"; // third memory address

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
