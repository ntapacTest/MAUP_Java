package les_20_dictionary_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DictionaryView extends JFrame {

    private JTextField field1;
    private JTextField field2;
    private JButton buttonTranslate;
    private JButton buttonClear;

    public DictionaryView(int width, int height) throws HeadlessException {

        int offsetX = 400;
        int offsetY = 400;

        this.setSize(width, height);

        this.setTitle("Dictionary ENG -> UKR");
        //this.setBounds(offsetX, offsetY, width, height);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("ENG:");
        field1 = new JTextField(10);

        JLabel label2 = new JLabel("UKR:");
        field2 = new JTextField(10);
        field2.setEditable(false);

        buttonTranslate = new JButton("Translate");
        buttonTranslate.setName(R.TRANSLATE);

        buttonClear = new JButton("Clear");
        buttonClear.setName(R.CLEAR);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.add(label1, 0);
        panel.add(label2, 1);
        panel.add(field1, 2);
        panel.add(field2, 3);
        panel.add(buttonTranslate, 4);
        panel.add(buttonClear, 5);

        this.setContentPane(panel);
        this.setAlwaysOnTop(true);

        this.setVisible(true);
    }

    public void setListener(ActionListener controller){
        buttonTranslate.addActionListener(controller);
        buttonClear.addActionListener(controller);
    }

    public String getField1() {
        return field1.getText();
    }

    public String getField2() {
        return field2.getText();
    }

    public void setField1(String text) {
        this.field1.setText(text);
    }

    public void setField2(String text) {
        this.field2.setText(text);
    }


}
