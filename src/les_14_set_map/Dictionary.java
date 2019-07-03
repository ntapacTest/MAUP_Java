package les_14_set_map;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String,String> dict=new HashMap<>();

    public Dictionary() {

    }

    public void addWord(String word, String translate){
        dict.put(word.toUpperCase(),translate);
    }

    public String translate(String word){

        if(!dict.containsKey(word.toUpperCase())){
            System.out.println("Word not found");
            return null;
        }

        System.out.println(dict.get(word.toUpperCase()));

        return dict.get(word.toUpperCase());
    }
}
