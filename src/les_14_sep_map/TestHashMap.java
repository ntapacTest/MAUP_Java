package les_14_sep_map;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jan", 31);
        map.put("feb", 28);
        map.put("mar", 31);
        map.put("apr", 30);
        map.put("may", 31);

        System.out.println("map = " + map);

        Integer janDays = map.get("jan");
        System.out.println("janDays = " + janDays);

        Integer nullObject = map.get(new Object());
        System.out.println("nullObject = " + nullObject);

        // 1. iterate keys
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.print("s = " + s + " ");
        }
        System.out.println();

        // 2. iterate values
        Collection<Integer> valuesSet = map.values();
        for (Integer v : valuesSet) {
            System.out.print("v = " + v + " ");
        }
        System.out.println();

        // 3. iterate entry (key, value)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("entry.key = " + entry.getKey() + " : entry.value = " + entry.getValue() + " ");
        }
        System.out.println();

        map.put("feb",29);

        System.out.println("map = " + map);
    }
}
