package les_11_enums;

import java.util.Comparator;

public class AppleByPriceComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
