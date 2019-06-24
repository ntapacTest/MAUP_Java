package les_12_exceptions;

public class TestTryCatchFinally {
    public static void main(String[] args) {

        int[] a = new int[1];

        int r = Math.random() > 0.5 ? 0 : 1;

        a = Math.random() > 0.5 ? null : new int[1];
        try {
            int b = 1 / r;
            a[r] = 10;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException = " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException = " + e);
            return;
        } catch (Exception e) {
            System.out.println("Exception = " + e);
            //e.printStackTrace();
            throw e;
        } finally {
            System.out.println("finally");
        }
        System.out.println("end method");

    }
}
