package les_12_exceptions;

public class TaskExceptions_1 {
    public static void main(String[] args) {

        double r = Math.random();
        try {
            if (r < 0.25) throw new NullPointerException("r=" + r);
            if (r < 0.5) throw new ArithmeticException("r=" + r);
            if (r < 0.75) throw new ArrayIndexOutOfBoundsException("r=" + r);
            throw new Exception("r=" + r);

        } catch (NullPointerException | ArithmeticException e){
            System.out.println("Bad programmer");
        } catch (Exception e) {
            System.out.println("Other: " + e.getClass().getSimpleName()+" " +e.getMessage());
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.print("line = " + stackTraceElement.getLineNumber()+", ");
                System.out.print("method = " + stackTraceElement.getMethodName()+", ");
                System.out.println("class = " + stackTraceElement.getClassName());
            }
        }

    }
}
