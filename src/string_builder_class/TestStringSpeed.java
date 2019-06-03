package string_builder_class;

public class TestStringSpeed {
    public static void main(String[] args) {
//        String s="";
//        long t1=System.currentTimeMillis();
//        for (int i = 0; i < 40000; i++) {
//            s+="hello";
//        }
//        long t2=System.currentTimeMillis();
//
//        System.out.println(t2-t1);

        StringBuilder sb=new StringBuilder();
        long t3=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }
        long t4=System.currentTimeMillis();

        System.out.println(t4-t3);
    }
}
