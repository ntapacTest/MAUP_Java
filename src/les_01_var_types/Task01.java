package les_01_var_types;

public class Task01 {
    public static void main(String[] args) {
        double x=Math.pow(2,32)+1;
        System.out.println("x = " + x);
        double result1=x/641;
        double result2=x%641;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        double result3=result1*641;
        System.out.println("result3 = " + result3);

        System.out.println(result3 == x);

        long xl=(long)Math.pow(2,32)+1;

        System.out.println("xl = " + xl);
        long resultL1=xl/641;
        long resultL2=xl%641;
        long resultL3=resultL1*641;
        System.out.println("resultL1 = " + resultL1);
        System.out.println("resultL2 = " + resultL2);

        System.out.println(resultL3 == xl);
    }
}
