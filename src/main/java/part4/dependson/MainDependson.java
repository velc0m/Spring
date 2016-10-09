package part4.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDependson {

    public static void main(String[] args) {

        new AnnotationConfigApplicationContext("part4.dependson");
    }
}
