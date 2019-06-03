package les_07_date;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date dd=new Date();
        System.out.println("dd = " + dd);

        Date d2=new Date(3243243222746L);
        System.out.println("d2 = " + d2);

        d2.setTime(0); // !!! Mutable
        System.out.println("d2 = " + d2);
    }
}
