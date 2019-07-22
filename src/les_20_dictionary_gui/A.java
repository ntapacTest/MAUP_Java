package les_20_dictionary_gui;

public class A {
    private static A ourInstance = new A();

    public static A getInstance() {
        return ourInstance;
    }

    private A() {
    }
}
