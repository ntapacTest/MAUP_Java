package les_08_interface;

public interface IInfo {
    default void info(){
        System.out.println("I am "+getClass().getSimpleName());
    }
}
