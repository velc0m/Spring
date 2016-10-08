package part3.mydb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Litvv on 07.10.2016.
 */
public class MyDbMain {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("part3.mydb");
    }
}
