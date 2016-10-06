package part1.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by LitVV on 18.06.2016.
 */
public class ObjectFactory {

    public static <T> T createObject(Class<T> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {


        T newObject = clazz.newInstance();

        Method[] methods = clazz.getMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(RunThisMethod.class)) {
                RunThisMethod ann = m.getAnnotation(RunThisMethod.class);
                if (ann != null) {
                    for (int i = 0; i < ann.repeat(); i++) {
                            m.invoke(newObject);
                    }
                }
            }
        }
        return newObject;
    }
}
