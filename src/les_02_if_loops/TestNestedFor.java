package les_02_if_loops;

public class TestNestedFor {
    public static void main(String[] args) {
        int k=10;
        int m=30;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
                //System.out.print("*");
            }
            System.out.println();
        }
    }
}
