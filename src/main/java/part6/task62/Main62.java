package part6.task62;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Litvv on 12.10.2016.
 */
public class Main62 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        TerminatorFactory bean = context.getBean(TerminatorFactory.class);
        bean.createTerminator().killSaraConor();
    }
}
