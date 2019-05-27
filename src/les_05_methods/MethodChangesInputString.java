package les_05_methods;

public class MethodChangesInputString {
    public static void main(String[] args) {
        String data="Java";

        System.out.println("data = " + data);

        changeStr(data);

        System.out.println("data = " + data);
    }

    static void changeStr(String inString)
    {
        inString+="blah blah blah";

        System.out.println("inString = " + inString);

    }
}
