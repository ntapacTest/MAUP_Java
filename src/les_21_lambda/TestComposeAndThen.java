package les_21_lambda;

import java.util.function.Function;

public class TestComposeAndThen {
    public static void main(String[] args) {
        Function<Double,Double> sinFunc=x->Math.sin(x);
        Function<Double,Double> plus5Func=x->x+5;

        Function<Double,Double> func1=plus5Func.compose(sinFunc); // sin(x)+5   // plus5Func.apply(sinFunc.apply(x))
        Function<Double,Double> func2=sinFunc.compose(plus5Func); // sin(x+5)   // sinFunc.apply(plus5Func.apply(x))

        System.out.println(func1.apply(Math.PI/2));  // sin(x)+5
        System.out.println(func2.apply(1d));         // sin(x+5)
        System.out.println(Math.sin(6));                // sin(6)
    }
}
