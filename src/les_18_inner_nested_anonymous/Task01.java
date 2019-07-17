package les_18_inner_nested_anonymous;

public class Task01 {
    public static void main(String[] args) {
        Order ord=new Order();

        ord.addItem("Bread",10,5);
        ord.addItem("Oil",20,2);
        ord.addItem("Egg",5,10);

        //System.out.println(ord.getTotalCost());

        ord.print();
    }
}
