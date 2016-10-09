package part4.task42;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCar {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class);
        Car bean = context.getBean(Car.class);
        System.out.println("It is a " + bean.style + ". Windows - " + bean.windows.count + ". Whells  = " + bean.wheel.model);
    }
}
