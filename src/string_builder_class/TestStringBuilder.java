package string_builder_class;

public class TestStringBuilder {
    public static void main(String[] args) {
        String s="Hello java";
        StringBuilder sb=new StringBuilder(s);

        sb.append(" courses!");
        System.out.println("sb = " + sb);

        sb.setCharAt(6,'J');
        System.out.println("sb = " + sb);

        sb.delete(sb.length()-2,sb.length());
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        sb.reverse();

        sb.insert(6,"dear ");
        System.out.println("sb = " + sb);
    }
}
