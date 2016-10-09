package part3.colorsConfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan("part3.colorsConfig")
public class JavaConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    ColoredFrame frame() {
        ColoredFrame frame = new ColoredFrame();
        frame.setColor(randomColor());
        return frame;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    Color randomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}