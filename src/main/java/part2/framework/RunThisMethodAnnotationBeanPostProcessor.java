package part2.framework;

import ExampleReflection.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by LitVV on 13.07.2016.
 */
public class RunThisMethodAnnotationBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        Class o = bean.getClass();

        Method[] methods = o.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunThisMethod.class)) {
                try {
                    System.out.println("-----------");
                    method.invoke(bean);
                    System.out.println("-----------");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                 }
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
