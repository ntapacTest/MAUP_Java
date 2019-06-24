package les_12_exceptions;

public class TestThrow {
    public static void main(String[] args){
        System.out.println(divide(10,0));
    }
    public static double divide(double a, double b)
            throws ArithmeticException  // Обязательно для проверяемых исключений
                                        // Для не проверяемых по желанию
    {
        if(b==0) throw new ArithmeticException();
        return a/b;
    }

}
