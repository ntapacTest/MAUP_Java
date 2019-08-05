package les_23_wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericPolymorphism {

    // PE CS
    // Producer - ? extends
    // Consumer - ? super
    public static void main(String[] args) {
        // ArrayList<Worker> workers =new ArrayList<Manager>();
        // ArrayList<Manager> не является наследником ArrayList<Worker>
        ArrayList<Worker> workers =new ArrayList<Worker>();
        workers.add(new Manager("name",10,10));
        workers.add(new Worker("name",10));
        workers.add(new Worker("name",10));
        workers.add(new Worker("name",10));

        ArrayList<Manager> managers=new ArrayList<Manager>();
        managers.add(new Manager("name",10,10));
        managers.add(new Manager("name",10,10));
        managers.add(new Manager("name",10,10));

        System.out.println(averageSalary(workers));     // OK
        // System.out.println(averageSalary(managers)); // ERROR!!!

        System.out.println(averageSalaryV2(workers));       // OK
        System.out.println(averageSalaryV2(managers));      // OK

        fillWithManagers(managers);
        System.out.println("ok1");
        //fillWithManagers(workers);    // ERROR!!!
        //System.out.println("ok2");
        fillWithManagersV2(managers);
        System.out.println("ok3");
        fillWithManagersV2(workers);
        System.out.println("ok4");
    }

    static int averageSalary(List<Worker> workers) {
        int sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }

    static int averageSalaryV2(List<? extends Worker> workers) {
        // список - Producer, только чтение
        // принимает спиок типов Worker или наследников Worker
        int sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }

    static void fillWithManagers(List<Manager> workers) {
        // список - Consumer, пишем в массив
        for (int i = 0; i < workers.size(); i++) {
            //workers.set(i, Math.random() > 0.5 ? new Worker("W" + Integer.toString(i), 10) : new Manager("M" + Integer.toString(i), 10, 10));
            workers.set(i,new Manager("M",10,10));
        }
    }

    static void fillWithManagersV2(List<? super Manager> workers) {
        // список - Consumer, пишем в массив
        // принимает список из Manager, или список из суперкласса (родителей) Manager
        for (int i = 0; i < workers.size(); i++) {
            //workers.set(i, Math.random() > 0.5 ? new Worker("W" + Integer.toString(i), 10) : new Manager("M" + Integer.toString(i), 10, 10));
            workers.set(i,new Manager("M",10,10));
        }
    }
}
