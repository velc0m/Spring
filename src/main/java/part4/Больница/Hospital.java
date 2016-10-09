package part4.Больница;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hospital {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Хирург василийСтепанов = (Хирург) context.getBean("василийСтепанов");
        Хирург иванИваныч = (Хирург) context.getBean("иванИваныч");
        василийСтепанов.оперировать();
        System.out.println("**********************");
        иванИваныч.оперировать();
    }
}
