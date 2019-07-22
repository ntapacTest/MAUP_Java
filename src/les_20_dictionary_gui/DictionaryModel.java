package les_20_dictionary_gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryModel {
    private Map<String,String> dict=new HashMap<>();

    public DictionaryModel(String fileName) {
        loadFromFile(fileName);
    }
    public DictionaryModel() {

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

    public void loadFromFile(String fileName){


        List<String> lines=null;
        try {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] split;

        for (String line : lines) {
            split = line.split(";");
            addWord(split[0].toUpperCase(),split[1].toUpperCase());
        }
    }
}
