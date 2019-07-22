package les_20_dictionary_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryController implements ActionListener {

    private DictionaryView view;
    private DictionaryModel model;

    public DictionaryController(DictionaryView view, DictionaryModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();

        if(button.getName()==R.CLEAR){
            view.setField1(null);
            view.setField2(null);
            return;
        }

        if(button.getName()==R.TRANSLATE)view.setField2(model.translate(view.getField1()));
    }
}
