package part5.task51;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part4.Больница.Хирург;

/**
 * Created by Litvv on 10.10.2016.
 */
public class Main51 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(part4.Больница.Config.class);
        Хирург василийСтепанов = (Хирург) context.getBean("василийСтепанов");
        василийСтепанов.оперировать();
    }
}
