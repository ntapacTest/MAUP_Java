package les_21_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestLambda {
    public static void main(String[] args) {

        Function<String, Integer>  length=s->s.length();

        Function<Integer,Integer> mult2=n->n*2;

        System.out.println(doSmthWithString("sss",length));


        BiFunction<Integer,Integer,Integer> biFunc=(x,y)->x+y;

        int biResult=biFunc.apply(10,5);



    }

    public static int doSmthWithString(String s,Function<String,Integer> function){
        return function.apply(s);
    }
}
