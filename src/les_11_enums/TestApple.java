package les_11_enums;

import java.util.Arrays;

public class TestApple {
    public static void main(String[] args) {
        Apple g10=Apple.GOLDEN;

        System.out.println("g10 = " + g10);

        Apple[] apples=new Apple[5];
        apples[0]=Apple.WINE;
        apples[1]=Apple.RED;
        apples[2]=Apple.RED;
        apples[3]=Apple.GOLDEN;
        apples[4]=Apple.WINE;

        for (Apple apple : apples) {
            System.out.println("apple = " + apple);
        }

        System.out.println("Default sort");
        Arrays.sort(apples);

        for (Apple apple : apples) {
            System.out.println("apple = " + apple);
        }

        System.out.println("Sort by price");
        Arrays.sort(apples,new AppleByPriceComparator());
        for (Apple apple : apples) {
            System.out.println("apple = " + apple);
        }
    }
}
