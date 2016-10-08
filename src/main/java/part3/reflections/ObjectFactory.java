package part3.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by LitVV on 18.06.2016.
 */
public class ObjectFactory {

    public static <T> T createObject(Class<T> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        T newObject = clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Inject annotation = field.getAnnotation(Inject.class);
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);
                field.set(newObject, min + new Random().nextInt(max - min));
            }
        }

        hadleMethodsAnnotation(clazz, newObject);
        return newObject;
    }

    private static <T> void hadleMethodsAnnotation(Class<T> clazz, T newObject) throws IllegalAccessException, InvocationTargetException {
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
    }
}
