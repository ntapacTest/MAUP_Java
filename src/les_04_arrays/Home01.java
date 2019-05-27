package les_04_arrays;

import java.lang.reflect.Array;

public class Home01 {
    public static void main(String[] args) {
        int[] data={1,5,2,9,11,4,7};

        double avrg=avarage(data);

        System.out.println("avrg = " + avrg);

        int avrg_num=avarage_num(data);

        System.out.println("avrg_num = " + avrg_num);

        System.out.println("data["+avrg_num+"] = " + data[avrg_num]);
    }

    private static double avarage(int[] inData){
        double result=0;

        for (int item : inData) {
            result+=item;
        }
        result= result/inData.length;

        return result;
    }

    private static int avarage_num(int[] inData)
    {
        double avrg=avarage(inData);

        int num=0;
        double min_dif= Math.abs(avrg-inData[0]);

        for (int i = 1; i < inData.length; i++) {
            double min_dif_iter=Math.abs(avrg-inData[i]);

            if(min_dif_iter<min_dif) {
                min_dif=min_dif_iter;
                num=i;
            }
        }
        return num;
    }
}
