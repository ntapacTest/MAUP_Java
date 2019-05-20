package les_01_var_types;

public class TestOverflow {
    public static void main(String[] args) {

        int numInt = Integer.MAX_VALUE;
        System.out.println("numInt = " + numInt);
        numInt = numInt + 1;
        System.out.println("numInt = " + numInt);

        double numDoubleMax = Double.MAX_VALUE;
        System.out.println("numDouble = " + numDoubleMax);
        numDoubleMax *= 2;
        System.out.println("numDouble = " + numDoubleMax);

        double numDoubleMin = -Double.MAX_VALUE;
        System.out.println("numDoubleMin = " + numDoubleMin);
        numDoubleMin *= 2;
        System.out.println("numDoubleMin = " + numDoubleMin);

        System.out.println(Math.sqrt(-1));

        System.out.println(numDoubleMax+numDoubleMax);
        System.out.println(numDoubleMin+numDoubleMin);
        System.out.println(numDoubleMax+numDoubleMin);

        System.out.println("Math.acos(10) = " + Math.acos(10));

        // Methods with exceptions
        //System.out.println("Math.addExact(Integer.MAX_VALUE,1) = " + Math.addExact(Integer.MAX_VALUE, 1));
    }
}
