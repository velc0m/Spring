package part6.task61;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Litvv on 11.10.2016.
 */
public class Main61 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyBean2 bean = context.getBean(MyBean2.class);
        try {
            bean.getStuff();
        } catch (Exception e) {
        }

        try {
            bean.getStuff();
        } catch (Exception e) {
        }

    }
}
