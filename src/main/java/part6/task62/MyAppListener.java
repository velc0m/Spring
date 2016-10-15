package part6.task62;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by Litvv on 12.10.2016.
 */
public class MyAppListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ConfigurableListableBeanFactory factory;

    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Listener has done his work...");

        ApplicationContext applicationContext = event.getApplicationContext();

        Collection<Object> values = applicationContext.getBeansOfType(Object.class).values();

        for (Object value : values) {
            Method[] methods = value.getClass().getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(PostInizialized.class)) {
                    System.out.println("Yes! This is THE METHOD!!!");
                    try {
                        method.invoke(value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
