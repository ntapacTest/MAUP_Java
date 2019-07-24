package function_evolution;

import java.util.function.Function;

public class Graph {

    private int x1,x2;

    public Graph(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void build(IFunction formula){
        for (int i = x1; i <=x2 ; i++) {
            System.out.print(formula.calculate(i)+" ");
        }
        System.out.println();
    }

    public void build2(IFunction2 formula){
        for (int i = x1; i <=x2 ; i++) {
            System.out.print(formula.run(i)+" ");
        }
        System.out.println();
    }

    public void build3(Function<Integer,Integer> formula){
        for (int i = x1; i <=x2 ; i++) {
            System.out.print(formula.apply(i)+" ");
        }
        System.out.println();
    }

}
