package les_23_wildcards;

public class ArrayPolymorphism {
    public static void main(String[] args) {

        Worker[] workers = new Manager[3]; // !!!!!!!!!!!!!!!!!
        workers[0] = new Manager("Tom", 10, 5);
        workers[1] = new Manager("Tom", 10, 10);
        workers[2] = new Manager("Tom", 10, 10);
        //workers[2]=new Worker("Tom",10);  // ArrayStoreException in runtime


        Manager[] managers = new Manager[3];
        managers[0] = new Manager("Jim", 15, 5);
        managers[1] = new Manager("Jim", 15, 5);
        managers[2] = new Manager("Jim", 15, 5);
        //managers[3]=new Worker("Jim",15);

        System.out.println(averageSalary(workers));
        System.out.println(averageSalary(managers));

        fillWithRandomWorkers(new Worker[]{         // OK
                new Worker("name",10),
                new Worker("name",10),
                new Worker("name",10)
        });
        System.out.println("ok1");

        //fillWithRandomWorkers(workers);           // !!!!!! ERROR
        //System.out.println("ok2");

        fillWithRandomWorkers(managers);            // !!!!!! maybe ERROR
        System.out.println("ok3");

    }

    static void fillWithRandomWorkers(Worker[] workers) {   // Worker[] - consumer, read and write
                                                            // пишем в массив
        for (int i = 0; i < workers.length; i++) {          // возможна ситуация когда войдет Manager[], а мы попытаемся записать Worker
            workers[i] = Math.random() > 0.5 ? new Worker("W" + Integer.toString(i), 10) : new Manager("M" + Integer.toString(i), 10, 10);
        }
    }

    static int averageSalary(Worker[] workers) {     // OK! Worker[] - producer - it is readonly
        int sum = 0;                                  // только читаем, не пишем.
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.length;
    }
}
