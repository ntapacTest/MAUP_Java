package les_14_set_map;

import java.util.Scanner;

public class TaskMap {
    public static void main(String[] args) {
        Dictionary dic=new Dictionary();

        dic.addWord("cat", "кіт");
        dic.addWord("dog", "пес");
        dic.addWord("bird", "птах");
        dic.addWord("fish", "риба");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word:");
        String word = scanner.next();

        dic.translate(word);
    }
}
