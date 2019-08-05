package HomeWorkStreams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestHWStreams {
    public static void main(String[] args) {
        Map<String, Integer> calendar = new HashMap<>();
        calendar.put("Jan", 31);
        calendar.put("Feb", 28);
        calendar.put("Mar", 31);
        calendar.put("Apr", 30);
        calendar.put("May", 31);
        calendar.put("Jun", 30);
        calendar.put("Jul", 31);
        calendar.put("Aug", 31);
        calendar.put("Sep", 30);
        calendar.put("Oct", 31);
        calendar.put("Nov", 30);
        calendar.put("Dec", 31);

        Map<Integer, List<String>> days = convertByDaysStream(calendar);

        for (Map.Entry<Integer, List<String>> entry : days.entrySet()) {
            System.out.println("entry = " + entry.getKey()
                    + ", " + entry.getValue());
        }
    }

    public static Map<Integer, List<String>> convertByDays(Map<String, Integer> calendar) {

        Map<Integer, List<String>> days = new HashMap<>();

        for (Map.Entry<String, Integer> value : calendar.entrySet()) {
            if (!days.containsKey(value.getValue())) {
                days.put(value.getValue(), new ArrayList<>());
            }
            days.get(value.getValue()).add(value.getKey());
        }

        return days;
    }


    public static <TSourceValue, TSouceKey> Map<TSourceValue, List<TSouceKey>> convertByDaysT(Map<TSouceKey, TSourceValue> inDictionary) {

        Map<TSourceValue, List<TSouceKey>> outDictionary = new HashMap<>();

        for (Map.Entry<TSouceKey, TSourceValue> value : inDictionary.entrySet()) {
            if (!outDictionary.containsKey(value.getValue())) {
                outDictionary.put(value.getValue(), new ArrayList<>());
            }
            outDictionary.get(value.getValue()).add(value.getKey());
        }

        return outDictionary;
    }

    public static <TSourceValue, TSouceKey> Map<TSourceValue, List<TSouceKey>> convertByDaysStream(Map<TSouceKey, TSourceValue> inDictionary) {

        return inDictionary.entrySet().stream()
                .collect(Collectors.groupingBy(p -> p.getValue()))
                .entrySet().stream()
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue().stream()
                        .map(l -> l.getKey()).collect(Collectors.toList())));

    }

}
