package part3.colors;

import org.springframework.beans.factory.FactoryBean;

import java.awt.*;
import java.util.Random;

public class ColorFactory implements FactoryBean<Color> {

    public Color getObject() throws Exception {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}