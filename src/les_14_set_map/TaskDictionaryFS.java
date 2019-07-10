package les_14_set_map;

import java.util.Scanner;

public class TaskDictionaryFS {
    public static void main(String[] args) {
        Dictionary dic=new Dictionary();

        dic.loadFromFile("EngUkr.txt");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input word:");
            String word = scanner.next();
            if(word.toUpperCase().equals("Q")) break;
            dic.translate(word);
        }
    }
}
