package function_evolution;

public class BuildGraph {
    public static void main(String[] args) {

        // y=x^2
        // -10 < x < 10

        Graph graph=new Graph(-10,10);

        // Создаем наследника Formula
        graph.build(new Formula() {
            @Override
            public int calculate(int x) {
                return x*x*x;
            }
        });

        // Анонимный класс реализация интерфейса IFunction
        graph.build(new IFunction() {
            @Override
            public int calculate(int x) {
                return x+x;
            }
        });

        // Лямбда функция
        graph.build(x -> (x+x)*x);
        graph.build2(x -> (x+x)*x);
        graph.build3(x -> (x+x)*x);

        // Лямбда через встроенный интефейс Function
        graph.build2(x -> x*2);

    }
}
