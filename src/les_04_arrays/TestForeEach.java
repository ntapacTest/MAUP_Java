package les_04_arrays;

public class TestForeEach {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int item : a) {
            System.out.println("item = " + item);
        }
    }
}
