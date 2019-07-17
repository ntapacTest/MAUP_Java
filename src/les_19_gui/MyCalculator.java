package les_19_gui;

import javax.swing.*;
import java.awt.*;

public class MyCalculator  extends JFrame {

    private JTextField field1;
    private JTextField field2;
    private JTextField result;


    public MyCalculator() throws HeadlessException {

        // 1. create panel
        JPanel panel=new JPanel();

        // 2. create layout (каким образом будут добавляться контролы)
        panel.setLayout(new FlowLayout());

        // 3. add controls
        panel.add(new JLabel("Number 1:"));
        field1=new JTextField(10);
        panel.add(field1);
        panel.add(new JLabel("Number 2:"));
        field2=new JTextField(10);
        panel.add(field2);

        result=new JTextField(10);
        //result.setEnabled(false);
        result.setEditable(false);
        panel.add(result);

        JButton buttonPlus=new JButton("+");
        panel.add(buttonPlus);

        JButton buttonMinus=new JButton("-");
        panel.add(buttonMinus);

        JButton buttonMult=new JButton("*");
        panel.add(buttonMult);

        JButton buttonDiv1=new JButton("/");
        panel.add(buttonDiv1);

        JButton buttonDiv2=new JButton("%");
        panel.add(buttonDiv2);

        // 4. Add panel to the frame
        this.setContentPane(panel);

        // 5. Sep on close action, sizes, visible and ...

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,100);

        this.setVisible(true);

        // 6. add action listener (observer)
        Controller controller=new Controller(this);
        buttonPlus.addActionListener(controller);
        buttonMinus.addActionListener(controller);
        buttonMult.addActionListener(controller);
        buttonDiv1.addActionListener(controller);
        buttonDiv2.addActionListener(controller);

        KeyController keyController = new KeyController(this);
        field1.addKeyListener(keyController);
        field2.addKeyListener(keyController);
    }

    public String getField1() {
        return field1.getText();
    }

    public String getField2() {
        return field2.getText();
    }

    public void setResult(String result) {
        this.result.setText(result);
    }
}
