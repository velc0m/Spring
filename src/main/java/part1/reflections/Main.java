package part1.reflections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by LitVV on 18.06.2016.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //Person person = ObjectFactory.createObject(Person.class);
    }
}
