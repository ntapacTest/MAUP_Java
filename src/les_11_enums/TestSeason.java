package les_11_enums;

import sun.security.mscapi.SunMSCAPI;

import java.util.Arrays;

public class TestSeason {
    public static void main(String[] args) {
        Season wi=Season.WINTER;
        Season sp=Season.SPRING;
        Season su=Season.SUMMER;
        Season au=Season.AUTUMN;

        // enum -> String
        System.out.println(wi);
        System.out.println(sp);
        System.out.println(su);
        System.out.println(au);

        // String -> enum
        Season ss=Season.valueOf("SUMMER");
        System.out.println(ss);

        // all enum values
        Season[] seasons=Season.values();
        System.out.println("seasons = " + Arrays.toString(seasons));

        // enum -> index
        System.out.println("ss.ordinal() = " + ss.ordinal());

        // index -> enum
        Season a2=Season.values()[3];
        System.out.println("a2 = " + a2);

    }
}
