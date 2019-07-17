package les_19_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private MyCalculator calculator;

    public Controller(MyCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String text = button.getText();

        Integer x=new Integer(calculator.getField1());
        Integer y=new Integer(calculator.getField2());
        double result=0;

        if(text.equals("+")){
            result=x+y;
        }else if(text.equals("-")){
            result=x-y;
        }else if(text.equals("*")){
            result=x*y;
        }else if(text.equals("/")){
            result=x/y;
        }else if(text.equals("%")){
            result=x%y;
        }

        calculator.setResult(Double.toString(result));
    }
}
