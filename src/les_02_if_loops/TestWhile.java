package les_02_if_loops;

public class TestWhile {
    public static void main(String[] args) {
        char a = 'A';
        while (a <= 'Z') {
            System.out.print((char) a);
            a++;
        }

        System.out.println();

        do {
            System.out.print((char) a);
            a++;
        } while (a <= 'Z');
    }
}
