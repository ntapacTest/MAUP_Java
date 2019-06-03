package les_07_date;

import java.time.LocalDate;

public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        LocalDate ld2=LocalDate.of(2019,9,30);
        System.out.println("ld2 = " + ld2);

        LocalDate endOfSummer=ld2.minusMonths(1).plusDays(1);
        System.out.println("endOfSummer = " + endOfSummer);
    }
}
