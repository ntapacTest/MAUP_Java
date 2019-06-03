package inheritance_and_casting;

public class Worker {
    public String name;
    protected int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
