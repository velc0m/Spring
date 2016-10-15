package part5.task51;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Litvv on 10.10.2016.
 */
@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    MyAspect myAspect() {
        return new MyAspect();
    }
}
