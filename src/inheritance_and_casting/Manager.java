package inheritance_and_casting;

public class Manager extends Worker {
    public int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +"("+bonus+")" +
                '}';
    }
}
