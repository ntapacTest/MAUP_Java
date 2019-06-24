package les_12_exceptions;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            m3();
        } catch (CustomException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void m1() throws CustomException {
        throw new CustomException(10);
    }

    public static void m2() throws CustomException {
        m1();
    }

    public static void m3() throws CustomException {
        m2();
    }

}

