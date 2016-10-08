package part3.colorsConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

//@Component
public class ColoredFrame extends JFrame {

    //@Autowired
    private Color color;

    @PostConstruct
    public void init() {
        setSize(400, 400);
        Random random = new Random();
        setLocation(random.nextInt(800), random.nextInt(500));
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
