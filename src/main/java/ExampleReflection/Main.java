package ExampleReflection;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by LitVV on 18.06.2016.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Person person = ObjectFactory.createObject(Person.class);
    }
}
