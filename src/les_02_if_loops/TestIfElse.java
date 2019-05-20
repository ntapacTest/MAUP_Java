package les_02_if_loops;

import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a:");
        int a = sc.nextInt();

        System.out.println("Input b:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a>b");
        } else if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a<b");
        }

        if(a>b) System.out.println("a>b");
        if(a==b) System.out.println("a==b");
        if(a<b) System.out.println("a<b");

    }
}
