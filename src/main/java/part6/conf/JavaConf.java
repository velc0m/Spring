package part6.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part6.aop.MyAspect;
import part6.prostotak.MyService;
import part6.prostotak.MyServiceImpl;

/**
 * Created by Litvv on 11.10.2016.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"part6.aop", "part6.prostotak"})
public class JavaConf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class);
        MyService bean = context.getBean(MyService.class);
        bean.work();
    }
}
