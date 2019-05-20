package les_02_if_loops;

import java.util.Scanner;

public class TestElseAndOr {
    public static void main(String[] args) {

        int a=0;
        int b=1;

        if(a==0||b==0||b==b/0) {
            System.out.println("Lazy or true");
        }
        else{
            System.out.println("Lazy or false");
        }

       /* if(a==1|b==1|b==b/0) {
            System.out.println("NotLazy or true");
        }
        else{
            System.out.println("NotLazy or false");
        }*/



    }
}
