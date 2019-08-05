package les_23_wildcards;

public class Manager extends Worker {

    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
