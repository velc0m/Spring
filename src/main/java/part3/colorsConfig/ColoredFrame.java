package part3.colorsConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColoredFrame extends JFrame {

    private Color color;

    @PostConstruct
    public void init() {
        setSize(400, 400);
        Random random = new Random();
        setLocation(random.nextInt(500), random.nextInt(500));
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
