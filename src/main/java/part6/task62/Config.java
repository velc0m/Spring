package part6.task62;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Litvv on 12.10.2016.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("part6.task62")
public class Config {

    /*@Bean
    public DepricationHandlerAspect aspect() {
        return new DepricationHandlerAspect();
    }*/

    @Bean
    public MyAppListener myAppListener() {
        return new MyAppListener();
    }
}
