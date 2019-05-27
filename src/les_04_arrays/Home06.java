package les_04_arrays;

import sun.awt.Symbol;

import java.util.Arrays;

public class Home06 {
    final private static int ALPHABETIC=0;
    final private static int NUMERICAL=1;
    final private static int OTHER=2;
    public static void main(String[] args) {
        String data="dslkfh3407qt87fcg[2223c9s83#56(ty";

        String[] result=split(data);

        System.out.println("result = " + Arrays.toString(result));
    }

    private static String[] split(String inData)
    {
        char[] inCharnArray=inData.toCharArray();

        char[] alphabetic;
        char[] numbers;
        char[] other;

        int[] charTypes=new int[inCharnArray.length];
        int alphCount=0;
        int numCount=0;
        int otherCount=0;
        for (int i = 0; i < inCharnArray.length; i++) {
            if(Character.isAlphabetic(inCharnArray[i])){
                charTypes[i]=ALPHABETIC;
                alphCount++;
            }else if(Character.isDigit(inCharnArray[i])) {
                charTypes[i]=NUMERICAL;
                numCount++;
            }else {
                charTypes[i]=OTHER;
                otherCount++;
            }
        }
        alphabetic=new char[alphCount];
        numbers=new char[numCount];
        other=new char[otherCount];
        alphCount=0;
        numCount=0;
        otherCount=0;
        for (int i = 0; i < charTypes.length; i++) {
            if(charTypes[i]==ALPHABETIC)
            {
                alphabetic[alphCount]=inCharnArray[i];
                alphCount++;
            }
            if(charTypes[i]==NUMERICAL)
            {
                numbers[numCount]=inCharnArray[i];
                numCount++;
            }
            if(charTypes[i]==OTHER)
            {
                other[otherCount]=inCharnArray[i];
                otherCount++;
            }
        }

        String[] result=new String[3];

        result[0]=new String(alphabetic);
        result[1]=new String(numbers);
        result[2]=new String(other);

        return result;
    }

}
