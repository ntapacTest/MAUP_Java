package les_18_inner_nested_anonymous;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Entry,Integer> map;

    class Entry{
        private String name;
        private int price;

        public Entry(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " " + price+" UAH";
        }
    }

    public Order() {
        map=new HashMap<>();
    }

    public void addItem(String name,Integer price, Integer count ){
        map.put(new Entry(name,price),count);
    }

    public int getTotalCost(){
        int cost=0;
        for (Map.Entry<Entry, Integer> entry : map.entrySet()) {
            cost += entry.getKey().price * entry.getValue();
        }

        return cost;
    }

    public void print(){
        for (Map.Entry<Entry, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString()+" X "+entry.getValue()+", Total "+entry.getKey().price*entry.getValue() + " UAH");
        }
        System.out.println("Total order: "+getTotalCost());
    }
}
