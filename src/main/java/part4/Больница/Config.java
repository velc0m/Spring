package part4.Больница;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("part6.aop")
@Import(part5.task51.Config.class) //For Aspect
public class Config {

    @Bean
    Хирург василийСтепанов() {
        return new ХирургImpl();
    }

    @Bean
    Хирург иванИваныч() {
        return new ХирургImpl();
    }

    @Bean
    Асистент асистент() {
        return new АсистентImpl() {
            @Override
            public СоленыйОгурец getСоленыйОгурец() {
                return соленыйОгурец();
            }
        };
    }

    @Bean
    Скальпель скальпель() {
        return new СкальпельImpl();
    }

    @Bean
    Спирт спирт() {
        return new СпиртImpl();
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    СоленыйОгурец соленыйОгурец() {
        return new СоленыйОгурецImpl();
    }

}
