package part3.production;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProduction {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("part3.production");
        MainDeliveryService bean = context.getBean(MainDeliveryService.class);
        bean.deliver(1);
        bean.deliver(2);
        bean.deliver(3);
    }
}
