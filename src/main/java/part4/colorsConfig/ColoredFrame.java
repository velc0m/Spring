package part4.colorsConfig;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class ColoredFrame extends JFrame {

    @PostConstruct
    public void init() {
        setSize(400, 400);
        Random random = new Random();
        setLocation(random.nextInt(500), random.nextInt(500));
        getContentPane().setBackground(getColor());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(500), random.nextInt(500));
        getContentPane().setBackground(getColor());
        this.repaint();
        this.validate();
    }

    public abstract Color getColor();
}
