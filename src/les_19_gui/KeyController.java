package les_19_gui;

import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyController implements KeyListener {
    private MyCalculator calculator;

    public KeyController(MyCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode==e.VK_DELETE){
            calculator.setResult("0");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
