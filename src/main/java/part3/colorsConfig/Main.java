package part3.colorsConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //variant 1
        //new AnnotationConfigApplicationContext("part3.colorsConfig");

        //variant 2
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(30);
            context.getBean(ColoredFrame.class);
        }
    }
}
