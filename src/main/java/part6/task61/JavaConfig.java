package part6.task61;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Litvv on 11.10.2016.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:dbaMails.properties")
@ComponentScan("part6.task61")
public class JavaConfig {

    @Bean
    PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ExceptionHandlingAspect aspect() {
        return new ExceptionHandlingAspect();
    }
}
