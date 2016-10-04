package part2.framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Litvv on 18.07.2016.
 */
public class TransactionBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> map = new HashMap<String, Class>();

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> originalClass = bean.getClass();
        Method[] methods = originalClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                map.put(beanName, originalClass);
                break;
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {

        Class<?> clazz = bean.getClass();
        //Если мы сделали MAP то уже не надо
        /*Method[] methods = clazz.getMethods();
        boolean transactionAnnotationFound = false;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                transactionAnnotationFound = true;
            }
        }*/

        final Class<?> originalClass = map.get(beanName);
        if (originalClass != null) {
            Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method originalMethod = originalClass.getMethod(method.getName(), method.getParameterTypes());
                    if (originalMethod.isAnnotationPresent(Transaction.class)) {
                        System.out.println("Start transaction");
                        Object retVal = method.invoke(bean, args);
                        System.out.println("End Transaction");
                        return retVal;
                    } else {
                        return method.invoke(bean, args);
                    }
                }
            });
            return proxy;
        }
        return bean;
    }
}
