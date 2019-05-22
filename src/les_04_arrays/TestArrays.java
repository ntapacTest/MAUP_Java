package les_04_arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for (int i = 0; i < 9; i++) {
            intArray[i] = i;
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
    }

}
