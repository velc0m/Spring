package part3.colorsConfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "part3.colorsConfig")
public class Config {

    @Bean
    //@Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Color randomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    // вместо @Component и @Autowired и @Bean
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ColoredFrame frame() {
        ColoredFrame frame = new ColoredFrame();
        frame.setColor(randomColor());
        return frame;
    }
}
