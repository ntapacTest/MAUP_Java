package les_20_dictionary_gui;

import les_14_set_map.Dictionary;

public class TestDictionary {
    public static void main(String[] args) {
        String fileName="EngUkr.txt";
        DictionaryModel dictionaryModel = new DictionaryModel();
        dictionaryModel.loadFromFile(fileName);

        DictionaryView dictionaryView = new DictionaryView(600, 120);

        DictionaryController controller=new DictionaryController(dictionaryView,dictionaryModel);

        dictionaryView.setListener(controller);

    }
}
