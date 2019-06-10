package les_09_inheritance_and_casting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jone", 100);
        Worker worker2 = new Worker("Bob", 120);
        Worker worker3 = new Worker("Bill", 100);
        Worker manager1 = new Manager("Max", 120, 30);
        Worker manager2 = new Manager("Jim", 150, 50);

        Worker[] workers = new Worker[5];
        workers[0] = worker1;
        workers[1] = worker2;
        workers[2] = worker3;
        workers[3] = manager1;
        workers[4] = manager2;

        System.out.println("workers = " + Arrays.toString(workers));
        System.out.println("avarregeSalary(workers) = " + averageSalary(workers));
        System.out.println("averageBonus(workers) = " + averageBonus(workers));
    }

    public static double averageSalary(Worker[] inData) {
        double result = 0;
        for (Worker worker : inData) {
            result += worker.getSalary();
        }
        result = result / inData.length;
        System.out.println("result = " + result);
        return result;
    }

    public static double averageBonus(Worker[] inData) {
        double result = 0;
        int count = 0;
        for (Worker worker : inData) {
            if (worker instanceof Manager) {
                result += ((Manager) worker).bonus;
                count++;
            }
        }

        result = result / count;
        System.out.println("result = " + result);
        return result;
    }

}
