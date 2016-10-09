package part4.colorsConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        for (int i = 0; i < 20; i++) {
            Thread.sleep(20);
            ColoredFrame bean = context.getBean(ColoredFrame.class);
            bean.showOnRandomPlace();
        }
    }
}
