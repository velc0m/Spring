package part3.reflections;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by LitVV on 18.06.2016.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Person person = ObjectFactory.createObject(Person.class);
        System.out.println(person);
    }
}
