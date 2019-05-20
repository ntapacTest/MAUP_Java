package les_02_if_loops;


import java.util.Scanner;

public class TestTernar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        System.out.println("Input c:");
        int c = sc.nextInt();
        System.out.println("Input d:");
        int d = sc.nextInt();

        int max = 0;

        max = (max < a) ? a : max;
        max = (max < b) ? b : max;
        max = (max < c) ? c : max;
        max = (max < d) ? d : max;

        System.out.println("max = " + max);
    }
}
