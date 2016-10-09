package part4.task42;

import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:contextTask42.xml")
@ComponentScan("part4.task42")
public class JavaConf {

    @Bean
    Car car() {
        return new Car("Sport car");
    }
}
