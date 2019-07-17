package les_19_gui;

import javax.swing.*;
import java.awt.*;

public class HelloWorldWindow {
    public static void main(String[] args) {
        new MyWindow();
    }
}

class MyWindow extends JFrame{
    public MyWindow() throws HeadlessException {

        this.setSize(300,400);
        this.setTitle("Hello World");
        this.add(new JButton("My button"));

        this.setVisible(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}