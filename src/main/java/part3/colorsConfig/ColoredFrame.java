package part3.colorsConfig;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

public class ColoredFrame extends JFrame {

    private Color color;

    @PostConstruct
    public void init() {
        setSize(400, 400);
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
