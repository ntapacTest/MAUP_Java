package les_02_if_loops;

public class TestFor {
    public static void main(String[] args) {

        String test="";

        for (int i = 'A'; i <= 'Z'; i++) {
            //System.out.print((char)i+" ");
            test+=(char)i;
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i==8) break;
            if(i==2)continue;
            //System.out.println("i = " + i);
            System.out.print(test.substring(i,i+1));
        }

    }

}
